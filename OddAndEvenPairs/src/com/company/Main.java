package com.company;

import java.awt.*;
import java.util.*;
import java.lang.String;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        String[] numbers = string.split(" ");
        if (numbers.length%2!=0){
            System.out.println("Invalid length");
            return;
        }
        List<Integer> nums = new ArrayList<Integer>();
        for (String str:numbers) {
            nums.add(Integer.parseInt(str));
        }
        for (int i = 0; i < nums.size()-1; i = i+2) {
            if(nums.get(i)%2 == 0 && nums.get(i+1)%2==0){
                System.out.printf("%d, %d -> both are even \n", nums.get(i),nums.get(i+1));
            }else if(nums.get(i)%2 != 0 && nums.get(i+1)%2!=0){
                System.out.printf("%d, %d -> both are odd \n", nums.get(i),nums.get(i+1));
            }else{
                System.out.printf("%d, %d -> different \n", nums.get(i),nums.get(i+1));
            }
        }
    }
}