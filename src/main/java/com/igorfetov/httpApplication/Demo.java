package com.igorfetov.httpApplication;

import java.io.IOException;
import java.util.List;

/**
 */
public class Demo {
    public static void main(String[] args) {
        try {

            List<AbstractHttpSender> httpList = List.of(
                    new ChromeHttp("https://www.example.com/"),
                    new AppleHttp("https://www.example.com/"),
                    new MozillaHttp("https://www.example.com/"),
                    new SafariHttp("https://www.example.com/"));
            httpList.forEach(abstractHttpSender -> {
                try {
                    abstractHttpSender.sendGetRequest();
                    System.out.println(abstractHttpSender.getResponseCode());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
