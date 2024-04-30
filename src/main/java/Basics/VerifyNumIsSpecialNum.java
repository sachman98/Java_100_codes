package Basics;

import java.util.Scanner;

public class VerifyNumIsSpecialNum {

    public static void main(String arg[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the digit to be verified:");
        int num=scanner.nextInt();
        int digit1=num/10;
        int digit2=num%10;
        System.out.println("The digits are : "+digit1+ digit2);
        int special=digit1+digit2+digit1*digit2;
        if (num==special){
            System.out.println(special+" is number is a special number ");
                    }else
                        System.out.println("The number is not special");


    }
}
