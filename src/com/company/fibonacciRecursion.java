package com.company;
import java.util.Scanner;

public class fibonacciRecursion {
        static int a = 0, b = 1, c = 0;

        static void printFibonacci(int count) {
            if (count > 0) {                                   //using recursion
                c = a + b;
                a = b;
                b = c;
                System.out.print(" " + c);
                printFibonacci(count - 1);
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number");
            int count = scanner.nextInt();
            System.out.print(a + " " + b);              // printing 0 and 1
            printFibonacci(count - 2);            // n-2 because 2 numbers are already printed
        }

    }
