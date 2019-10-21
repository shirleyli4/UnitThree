package com.company;
import java.util.Scanner;
public class FindLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();
        if (num1 > num2) {
            System.out.println(num1 + " is larger than " + num2);
        }
        if (num1 < num2) {
            System.out.println(num2 + " is larger than " + num1);
        }
        if (num1 == num2) {
            System.out.println(num1 + " and " + num2+ " are equal");
        }
    }
}
