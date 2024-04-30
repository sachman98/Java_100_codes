package Basics;

import java.util.Scanner;

public class VerifyTheBiggestNum {

    public static void main(String arg[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any three values to be comapred: ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        if (num1>num2 && num1>num3)
            System.out.println(num1+" is the biggest number");
        else if (num2>num1 && num2>num3)
            System.out.println(num2 + " is the biggest number");
        else
            System.out.println(num3+ " Is the biggest number ");

    }

}
