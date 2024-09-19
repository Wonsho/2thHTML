package com.newlecture.web.class8th.km.client;

import com.newlecture.web.class8th.km.controller.Controller;

import java.io.FileNotFoundException;

public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        new Controller().getUrl();
    }
}

