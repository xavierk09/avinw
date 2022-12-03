package com.abhinav;
import java.util.Scanner;

public class UniqueNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        int input = sc.nextInt();

        for (int tochk = 0; tochk <= 9; tochk++){
            int c = 0, digit,
                    copy = input;
            while (copy != 0){
                digit = copy % 10;
                if (digit == tochk) c++;
                copy /= 10;
            }
            if (c > 1) {
                System.out.println("Not a unique number.");
                break;
            };
        }
    }
}
