package org.example;

import java.util.Arrays;

public class calculator {
    // Add function for two or more numbers
    public static int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Multiply function for two or more numbers
    public static int multiply(int... numbers) {
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        return product;
    }
}