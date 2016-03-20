package com.company;
import java.util.Scanner;
import java.io.*;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        float b = input.nextFloat();
        float c = input.nextFloat();

        System.out.printf("|%1$-10X|%2$10s|%3$10.2f|%4$-10.3f|",a,String.format("%10s", Integer.toBinaryString(a)).replace(" ", "0"),b,c);
    }
}
