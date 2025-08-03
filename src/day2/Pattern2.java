//Input: 4
//
//        Output:
//        ****
//        ***
//        **
//        *


        package day2;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int a  = sc.nextInt();sc.close();
        for (int i=a;i>=1;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
