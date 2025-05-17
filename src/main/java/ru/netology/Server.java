package ru.netology;

import java.net.ServerSocket;

public class Server {

    private int port;
    private String basePath;

    public void setPort(int port) {
        this.port = port;
    }
    
    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public void addHandler(Methods method, String path, Handler handler) {

    }

    public void listen(int port) {

    }
}
