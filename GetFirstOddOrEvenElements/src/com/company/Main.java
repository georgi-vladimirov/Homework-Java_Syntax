package com.company;
import java.awt.*;
import java.util.*;
import java.lang.String;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        String[] numbers = string.split(" ");
        List<Integer> nums = new ArrayList<Integer>();
        for (String str : numbers) {
            nums.add(Integer.parseInt(str));
        }
        String c = input.next();
        int n = input.nextInt();
        String command = input.next();

        oddOrEven(nums, n, command);
    }

    private static void oddOrEven(List<Integer> nums, int n, String command) {
        if (command.equals("odd")) {
            for (int num:nums) {
                if (num % 2 != 0) {
                    if (n > 0) {
                        System.out.print(num + " ");
                        n--;
                    }
                }
            }
        } else if (command.equals("even")) {
            for (int num:nums) {
                if (num % 2 == 0) {
                    if (n > 0) {
                        System.out.print(num + " ");
                        n--;
                    }
                }
            }
        }
    }
}
