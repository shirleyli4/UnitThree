package com.company;
import java.util.Scanner;
public class DiscriminantAndRoots {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ceofficients(a): ");
        int a = input.nextInt();
        System.out.println("Enter ceofficients(b): ");
        int b = input.nextInt();
        System.out.println("Enter ceofficients(c): ");
        int c = input.nextInt();
        System.out.println(roots(a, b, c));
    }
    public static String roots(int a, int b, int c){
        double dis = Math.pow(b,2)-4*a*c;
        if(dis<0){
            return a+"x^2 + "+b+"x + "+c+" has 2 imaginary root";
        }else if(dis>0){
            return a+"x^2 + "+b+"x + "+c+" has 2 real root";
        }else{
            return a+"x^2 + "+b+"x + "+c+" has 1 real root";
        }
    }
}
