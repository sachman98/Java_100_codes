package Basics;

import java.util.Scanner;

public class VerifyNumIsPosOrNeg {

    public static void main(String arg[]){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number to be verified");
       int num= scanner.nextInt();
       if (num<0){
           System.out.println("The entered number is negative: "+num);
       }else {
           System.out.println("The entered number is positive: "+num);
       }
    }
}
