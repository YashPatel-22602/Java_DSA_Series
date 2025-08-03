//Input: 4
//
//        Output:
//         *******
//          *****
//           ***
//            *



        package day2;

import java.util.Scanner;

public class Inverted_Pyaramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int a = sc.nextInt();sc.close();
        for (int i=a;i>0;i--){
            for (int j=i;j<a;j++){
                System.out.print(" ");
            }
            for (int k=i*2;k>1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
