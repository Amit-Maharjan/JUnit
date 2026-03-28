package com.maharjan.amit.services;

public class CalculatorService {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int ...numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) return -1;
        return a / b;
    }
}
