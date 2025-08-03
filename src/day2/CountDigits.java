package day2;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number:");
            int a = sc.nextInt();
            sc.close();
            int result = 0;

            while (a != 0) {
                result += 1;
                a = a / 10;
            }

            System.out.println("The number of digits are: " + result);
        }catch (Exception e){
            System.out.println("The Entered Number is not an Integer");
        }
    }
}
