package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
	    Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        double f1Result = (Math.pow(a,2)+Math.pow(b,2))/(Math.pow(a,2)-Math.pow(b,2));
        f1Result = Math.pow(f1Result,(a+b+c)/Math.sqrt(c));
        double f2Result = Math.pow(Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,3),a-b);
        double f3Result = Math.abs(((a+b+c)/3d)-((f1Result+f2Result)/2));
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",f1Result,f2Result,f3Result);
    }
}
