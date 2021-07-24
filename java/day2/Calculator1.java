package day2;

import java.util.Scanner;

public class Calculator1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Addition of two numbers
        System.out.println("Enter a number:  ");
        int n1 = sc.nextInt();
        System.out.println("Enter a number:  ");
        int n2 = sc.nextInt();
        int sum = n1 + n2 ;
        System.out.println("Addition of two numbers : " + sum);

        // Subtraction of two numbers
        System.out.println("Enter a number:  ");
        int a = sc.nextInt();
        System.out.println("Enter a number:  ");
        int b = sc.nextInt();
        int sub = a - b ;
        System.out.println("Subtraction of two numbers : " + sub);

        // Multiplication of two numbers
        System.out.println("Enter a number:  ");
        int x = sc.nextInt();
        System.out.println("Enter a number:  ");
        int y = sc.nextInt();
        int mul = x * y ;
        System.out.println("Multiplication of two values : " + mul);

        // Division of two numbers
        System.out.println("Enter a number:  ");
        float num1 = sc.nextFloat();
        System.out.println("Enter a number:  ");
        float num2 = sc.nextFloat();
        float div = num1 / num2 ;
        System.out.println("Division of two numbers : " + div);

        // Modulus of two numbers
        System.out.println("Enter a number:  ");
        float u = sc.nextFloat();
        System.out.println("Enter a number:  ");
        float v = sc.nextFloat();
        float mod = u / v ;
        System.out.println("Modulus of two numbers : " + mod);
    }



}



