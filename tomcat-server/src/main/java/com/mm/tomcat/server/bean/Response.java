package com.mm.tomcat.server.bean;

import java.io.OutputStream;

/**
 * @auther: fujie.feng
 * @DateT: 2019-06-25
 */
public class Response {

    private OutputStream outputStream;

    private Request request;


    public OutputStream getOutputStream() {
        return outputStream;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
