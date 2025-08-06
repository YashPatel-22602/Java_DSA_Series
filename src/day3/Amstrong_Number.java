package day3;

import java.util.Scanner;

public class Amstrong_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int a = sc.nextInt();sc.close();
        int og = a;
        int result = 0;
        int b = 0;
        while (a !=0){
            b = a % 10;
            result = result + (b*b*b);
            a = a/10;
        }
        if (result == og){
            System.out.println("The Entered Number is Armstrong");
        }
        else{
            System.out.println("The Entered Number is not an Armstrong");
        }
    }
}
