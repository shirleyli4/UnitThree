package com.company;

public class TrickyDice {
    public static void main(String[] args){
        regularRoll();
        trickyRoll();
    }
    private static void regularRoll(){
        double num = Math.random();
        double dice = (int)(num*6)+1;
        System.out.println(dice);
    }
    private static void trickyRoll(){
        double num = Math.random();
        double val = (int)(num*100)+1;
        if(val<16){
            System.out.println("1");
        }else if(val<32){
            System.out.println("2");
        }else if (val<45){
            System.out.println("3");
        }else if(val<68){
            System.out.println("4");//this is the weighted one
        }else if(val<82){
            System.out.println("5");
        }else if(val>82){
            System.out.println("6");
        }
    }
}
