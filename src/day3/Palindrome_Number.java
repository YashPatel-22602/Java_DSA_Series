package day3;

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a  = sc.nextInt();sc.close();
        String str1 = Integer.toString(a);
        int i = 0;
        int j = str1.length() - 1;
        boolean isPalindrome = true;
        while(i<j){
            if (str1.charAt(i) == str1.charAt(j)){
                i +=1;
                j -= 1;
            }
            else {
                isPalindrome = false;
                i +=1;
                j -= 1;
            }
        }
        if (isPalindrome == true){
            System.out.println("Entered Number is Plaindrome");
        }
        else{
            System.out.println("The Number is not Palindrome");
        }

    }
}
