package com.abhinav;
import java.util.Scanner;

public class Factorial {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number.");
        int input = sc.nextInt();

        int i = 1;
        int factorial = 1;

        for (; i<=input; i++){
            factorial *= i;
        }

        System.out.printf("Factorial of %d = %d", input, factorial);
    }
}
