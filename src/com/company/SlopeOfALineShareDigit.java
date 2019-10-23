package com.company;
import java.util.Scanner;
public class SlopeOfALineShareDigit {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the x coordinate of the first point: ");
        int x1 = input.nextInt();
        System.out.println("Enter the y coordinate of the first point: ");
        int y1 = input.nextInt();
        System.out.println("Enter the x coordinate of the second point: ");
        int x2 = input.nextInt();
        System.out.println("Enter the y coordinate of the second point: ");
        int y2 = input.nextInt();
        System.out.println(slope(x1, y1, x2, y2));
    }
    private static String slope(int x1, int y1, int x2, int y2) {
        if (x1 == x2) {
            return "The line defined by the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is a vertical line and the slope is undefined.";
        } else {
            double slope = (y2-y1)/(x2-x1);
            return "The line defined by the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is not a vertical line and the slope is "+slope+".";
        }
    }
}

