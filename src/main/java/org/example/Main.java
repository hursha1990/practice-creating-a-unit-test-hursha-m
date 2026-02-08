package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int userNum1 = input.nextInt();
        System.out.println("Enter the second number:");
        int userNum2 = input.nextInt();
        Main obj = new Main();
        System.out.println("The sum of total is: " + obj.add(userNum1, userNum2) );
    }
    public Integer add(int a, int b) {
        return a + b;
    }
}