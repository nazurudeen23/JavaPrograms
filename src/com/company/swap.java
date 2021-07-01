package com.company;

import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        int x, y, temp;
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        x = in.nextInt();
        System.out.println("Input the second number: ");
        y = in.nextInt();

        temp = x;
        x = y;
        y = temp;

        System.out.println(" Swapped values are :" + x + " and " + y);
    }
}