//not finished
package com.company;
import java.util.Scanner;
public class RightTriangle {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter three integer sides of a triangle:");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();

    System.out.println(isTriangle(a,b,c));
    System.out.println(isRight(a,b,c));
    }
    public static boolean isRight(int a,int b,int c){
        if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)||Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2)||Math.pow(c,2)+Math.pow(b,2)==Math.pow(a,2)){
            return true;
        }else{
            return false;
        }
    }


    public static boolean isTriangle(int a,int b,int c){
        if(a+b>c&&a+c>b&&b+c>a){
                return true;
                System.out.println("The side lengths of " + a + ", " + b + ", and " + c + " form a right triangle, but it is not a right triangle");
            }else{
                return false;
                System.out.println("The side lengths of " + a + ", " + b + ", and " + c + " form a triangle, but it is not a right triangle");
            }
        }
    }


