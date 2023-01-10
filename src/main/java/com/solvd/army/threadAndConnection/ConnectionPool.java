package com.solvd.army.threadAndConnection;
import com.solvd.army.Runner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.CompletableFuture;

public class ConnectionPool {

    private static Logger logger = LogManager.getLogger(Runner.class.getName());
    private LinkedBlockingQueue<Connection> connections;
    private static ConnectionPool instance;

    public ConnectionPool(int poolSize) {
        connections = new LinkedBlockingQueue<>(poolSize);
        for (int i = 0; i < poolSize; i++) {
            connections.add(new Connection());
        }
    }

    public static synchronized ConnectionPool getInstance() {
        if (instance == null) {
            instance = new ConnectionPool(5);
            logger.info("Lazy initialized new connection pool");
        }
        return instance;
    }

    public CompletableFuture<Connection> getConnection() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return connections.take();
            } catch (InterruptedException e) {
                logger.error("Connection interrupted");
                throw new RuntimeException(e);
            }
        });
    }

    public CompletionStage<Void> close() {
        return CompletableFuture.runAsync(() -> {
            for (Connection connection : connections) {
                connection.close();
            }
        });
    }

}
