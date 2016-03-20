package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        String firstString = input.next();
        String secondString = input.next();
        System.out.println(charMultiplier(firstString,secondString));
    }
    public static int charMultiplier(String first,String second){
        int multiplier = 0;
        int result= 0;
        for (int i = 0; i < Math.min(first.length(),second.length()) ; i++) {

            multiplier = first.charAt(i)*second.charAt(i);
            result += multiplier;
        }
        if (first.length()>second.length()){
            for (int i = Math.min(first.length(),second.length()); i < first.length() ; i++) {
                result +=first.charAt(i);
            }
        }else{
            for (int i = Math.min(first.length(),second.length()); i < second.length() ; i++) {
                result +=second.charAt(i);
            }
        }
        return result;
    }
}
