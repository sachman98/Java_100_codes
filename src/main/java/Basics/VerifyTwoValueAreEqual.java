package Basics;

import java.util.Scanner;

public class VerifyTwoValueAreEqual {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value :");
        System.out.println("Enter the second value : ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        if (num1==num2){
            System.out.println("The numbers are equal");
        }else {
            System.out.println(num1 + " Is not same as "+ num2);
        }
    }
}
