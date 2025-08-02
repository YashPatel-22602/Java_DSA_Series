package day2;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number greater than 1:");
        int a  = sc.nextInt();sc.close();
        int count  = 0;
        for(int i=2;i<=a/2;i++){
            if (a % i == 0){
                count++;
            }

        }
        if (a<2){
            System.out.println("Entered Number is Not Valid");
        }
        else if (count == 0){
            System.out.println("It is a Prime Number");
        }
        else{
            System.out.println("It is not a Prime Number");
        }
    }
}
