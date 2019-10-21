package com.company;
import java.util.Scanner;

public class AddToPositiveOrNegativeSum {
    public static void main(String[] args) {
        //declare and instantiate a Scanner variable and object
        Scanner input = new Scanner(System.in);
        //declare and initialize a positive and negative sum
        double posisum = 0;
        double negasum = 0;
        for (int i = 1; i <= 10; i++) {
            /* in this block, allow the user to input a number and add the number to the appropriate sum */
            System.out.println("Enter a number: ");
            double number = input.nextDouble();
            if(number>0){
                posisum += number;
            }
            if(number<=0){
                negasum+=number;
            }
            System.out.println("The sum of the positive numbers is "+posisum);
            System.out.println("The sum of the negative numbers is "+negasum);
        }

        //output the sums    }

    }
}
