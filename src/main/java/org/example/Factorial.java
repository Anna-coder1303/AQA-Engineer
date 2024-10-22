package org.example;

public class Factorial {

    public static int CalcFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал не может быть рассчитан для отрицательных чисел");
        }
        if (n == 0) {
            return 1;
        } else {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}