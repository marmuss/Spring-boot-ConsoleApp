package com.example.console;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter {

    public void write(String message){
        System.out.println(message);
    }
}
