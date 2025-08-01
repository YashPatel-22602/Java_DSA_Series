package com.day1;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number greater than 0: ");
        int a = sc.nextInt();sc.close();
        if (a == 0){
            System.out.println("The Given Number is 0");
        }
        else if (a % 2 == 0){
            System.out.println("The Given Number is Even");
        }
        else{
            System.out.println("The Given Number is Odd");
        }
    }
}
