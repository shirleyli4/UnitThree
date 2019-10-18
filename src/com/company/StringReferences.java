package com.company;

public class StringReferences {
    public static void main(String[] args){
        String word = "hello";
        String sentence = null;
        String str = "hello";
        System.out.println("Test if word and sentence contain the same address: "+word==sentence);
        System.out.println("Test if sentence is null: "+ sentence==null);
        System.out.println("Test if word and str contain the same address: "+ word==str);
        System.out.println("Test if word is not null: "+ word!=null);
    }
}
