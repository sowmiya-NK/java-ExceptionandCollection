package com.exception;

public class ThrowKeyword {
    public static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("Not eligible to vote");//explicity throw an exception
        else
            System.out.println("eligible to vote");


    }

    public static void main(String[] args) {
        validate(3);
    }

}


//throw-->handle only one exception
//throws-->handle multiple exception in single line


