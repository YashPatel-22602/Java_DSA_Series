package day2;

import java.util.Scanner;

public class Largest_amoong_three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1:");
        int a = sc.nextInt();sc.nextLine();
        System.out.print("Enter Number 2:");
        int b = sc.nextInt();sc.nextLine();
        System.out.print("Enter Number 3:");
        int c = sc.nextInt();sc.nextLine();sc.close();
//        if (a>b && a>c){
//            System.out.println("Number 1 is Greater");
//        }
//        else if (b>a && b>c){
//            System.out.println("Number 2 is Greater");
//        }
//        else{
//            System.out.println("Number 3 is Greater");
//        }


//Using Math.max Function
    int d  = Math.max(a, Math.max(b,c));
        System.out.println("The Largest Number is:" + d);
    }
}
