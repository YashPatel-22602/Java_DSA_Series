package day2;

import java.util.Scanner;

public class Hollow_Right_angle {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a  = sc.nextInt();sc.close();
        for (int i=0;i<a;i++){
            if (i == 0){
                System.out.print("*");
                System.out.println();
            }
            else if (i < a-1){
                System.out.print("*");
                for (int j = 0;j<i-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            else {
                for (int k =0;k<a;k++){
                    System.out.print("*");
                }
            }
        }
    }
}
