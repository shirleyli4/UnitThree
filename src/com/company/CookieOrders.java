package com.company;
import java.util.Scanner;
public class CookieOrders {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1-4 boxes:                6.95 per box\n" +
                "5-9 boxes:                5.95 per box\n" +
                "10-15 boxes:                5.50 per box\n" +
                "16 or more boxes:            4.95 per box\n" +
                "Enter the number of boxes you wish to purchase:\n");
        int numBoxes = input.nextInt();
        System.out.println(totalCost(numBoxes));
    }
    public static String totalCost(int numBoxes){
       if(numBoxes>=1&&numBoxes<=4){
           double price = 6.95;
           return "You bought "+numBoxes+" boxes of cookies at $"+price+" per box. Your  total bill is $"+price*numBoxes;
       }else if(numBoxes>=5&&numBoxes<=9){
           double price = 5.95;
           return "You bought "+numBoxes+" boxes of cookies at $"+price+" per box. Your  total bill is $"+price*numBoxes;
       }else if(numBoxes>=10&&numBoxes<=15){
           double price = 5.50;
           return "You bought "+numBoxes+" boxes of cookies at $"+price+" per box. Your  total bill is $"+price*numBoxes;
       }else if(numBoxes>=16){
           double price = 4.95;
           return "You bought "+numBoxes+" boxes of cookies at $"+price+" per box. Your  total bill is $"+price*numBoxes;
       }else{
           return "Your input is invalid";
       }
    }
}
