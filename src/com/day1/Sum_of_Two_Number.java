package com.day1;

import java.util.Scanner;

public class Sum_of_Two_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int a = sc.nextInt();sc.nextLine();
        System.out.print("Enter the Number 2: ");
        int b = sc.nextInt();sc.close();
        System.out.println("The Sum of Two Number is: " + (a + b));
    }
}
