package com.mm.tomcat.server.bean;

import java.io.IOException;
import java.io.InputStream;

/**
 * @auther: fujie.feng
 * @DateT: 2019-06-25
 */
public class Request {

    private InputStream inputStream;

    private String url;

    private String method;

    public void parseRequest() {

        StringBuilder sb = new StringBuilder();
        int i;

        byte[] buffer = new byte[1024];
        try {
            i = inputStream.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
            i = -1;
        }
        for (int j = 0; j < i; j++) {
            sb.append((char) buffer[j]);
        }
        this.setUrl(sb.toString());
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        int one = url.indexOf(" ");
        int two = url.indexOf(" ", one + 1);
        if (one == -1 || two == -1) {
            return;
        }
        this.url = url.substring(one + 1, two);
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
