package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        int rem = 0;
        int power = 0;
        int result = 0;
        while (value>0){
            rem = value%10;
            result = result + (int)(rem*Math.pow(7,power));
            power++;
            value /=10;
        }
        System.out.println(result);
    }
}
