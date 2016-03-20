package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] randNums = new int[Math.abs(m - n)+1];
        int smallNum = Math.min(n,m);
        for (int i = 0; i <= Math.abs(m-n); i++) {
            randNums[i] = i+smallNum;
        }
        shuffleArray(randNums);
        for (int num : randNums) {
            System.out.println(num);
        }
    }
    static void shuffleArray(int[] array)
    {
        int index;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            if (index != i)
            {
                array[index] ^= array[i];
                array[i] ^= array[index];
                array[index] ^= array[i];
            }
        }
    }
}