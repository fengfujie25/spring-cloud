package com.mm.tomcat.server.servers;

import com.mm.tomcat.server.bean.Request;
import com.mm.tomcat.server.bean.Response;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @auther: fujie.feng
 * @DateT: 2019-06-25
 */
public class TomcatServer {

    private static final int PORT = 8080;


    public void listener() {
        ServerSocket serverSocket = null;
        try {

            serverSocket = new ServerSocket(PORT, 1, InetAddress.getByName("127.0.0.01"));
            Socket accept = serverSocket.accept();

            InputStream inputStream = accept.getInputStream();
            OutputStream outputStream = accept.getOutputStream();

            Request request = new Request();
            request.setInputStream(inputStream);

            Response response = new Response();
            response.setOutputStream(outputStream);
            response.setRequest(request);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
