package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        int rem = 0;
        String result = "";
        while (value>0){
            rem = value%7;
            value = value/7;
            result = rem+result;
        }
        System.out.println(result);
    }
}
