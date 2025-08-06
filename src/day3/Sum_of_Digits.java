package day3;

import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int a = sc.nextInt();sc.close();
        int result = 0;
        while (a != 0){
            result = result + (a%10);
            a = a / 10;
        }
        System.out.println("The Sum of Digits are: "+result);
    }
}
