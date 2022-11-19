package com.abhinav;
import java.util.Scanner;

public class Hertz {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int input = sc.nextInt();

        for (int tochk = 0; tochk <= 9; tochk++){
            int copy = input, digit, c = 0;

            while (copy > 0){
                digit = copy % 10;
                if (digit == tochk) c++;
                copy = copy / 10;
            }

            if (c != 0){
                System.out.printf("%d is printed %d times\n", tochk, c);
            }
        }
    }
}
