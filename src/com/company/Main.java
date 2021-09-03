package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter grams");
        double grams = Scanner.nextDouble ();
        double kg = grams / 1000;
        System.out.println("Kilograms" + kg);

    }
}
