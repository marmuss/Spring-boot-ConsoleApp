package com.example.console;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleReader {

    public String readStr(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public double readDouble(){
        Scanner scanner = new Scanner(System.in);
        Double input = scanner.nextDouble();
        return input;
    }
}
