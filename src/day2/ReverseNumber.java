package day2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        sc.close();

        int result = 0;

        while(a != 0){
            result = result * 10 + (a % 10);
            a = a / 10;
        }

        System.out.println("The reversed number is: " + result);
    }
}
