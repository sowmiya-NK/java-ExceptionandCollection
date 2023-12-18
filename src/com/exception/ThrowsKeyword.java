package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream f = new FileInputStream("aaa.txt");

    }
}
