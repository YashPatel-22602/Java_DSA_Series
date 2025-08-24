package day4;

import java.util.ArrayList;
import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array:");
        int a = sc.nextInt();sc.nextLine();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i=0;i<a;i++){
            System.out.print("Enter the Number "+(i+1) + ":");
            int b = sc.nextInt();sc.nextLine();
            arr1.add(b);
        }
        System.out.print("Enter the Number you want to search:");
        int c = sc.nextInt();sc.close();
        boolean f = false;
        int in = 0;
        for (int j : arr1){
            if (j == c){
                f = true;
                in = arr1.indexOf(j);
            }
        }

        if (f == true){
            System.out.println("The Number you have entered is founded at index "+(in));
        }
        else{
            System.out.println("Sorry better luck next time");
        }
    }
}
