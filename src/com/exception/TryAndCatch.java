package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryAndCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Two numbers : ");
        //try block have set of code
        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int c = num1 / num2;
            System.out.println(c);

            FileInputStream fileInputStream=new FileInputStream("sowmiya.text");

        } catch (ArithmeticException e) {
            System.out.println("Don't enter zero as second input");//catch block can catch that runtime error
//            System.out.println(e.toString());//the exception information using toString() method
        } catch (FileNotFoundException e) {
            System.out.println("Please enter a valid file name");
        }
        //always final block will run
        finally {
            System.out.println("completed");
        }

    }
}
