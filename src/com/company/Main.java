package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String echo;
        do {
            echo=scanner.nextLine();
            System.out.println("echo");
        } while (!echo.equals("quit"));
    }
}
