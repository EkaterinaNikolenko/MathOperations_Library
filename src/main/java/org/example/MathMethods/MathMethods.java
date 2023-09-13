package org.example.MathMethods;

public class MathMethods {

    public int addition(int a, int b) {
        return a + b;
    }
    public double addition(double a, double b) {
        return a + b;
    }
    public float addition(float a, float b) {
        return a + b;
    }
    public long addition(long a, long b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }
    public double subtraction(double a, double b) {
        return a - b;
    }
    public float subtraction(float a, float b) {
        return a - b;
    }
    public long subtraction(long a, long b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }
    public double multiplication(double a, double b) {
        return a * b;
    }
    public float multiplication(float a, float b) {
        return a * b;
    }
    public long multiplication(long a, long b) {
        return a * b;
    }

    public int division(int a, int b) {
        try {
            return a / b;
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
    }
    public double division(double a, double b) {
        try {
            return a / b;
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
    }
    public float division(float a, float b) {
        try {
            return a / b;
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
    }
    public long division(long a, long b) {
        try {
            return a / b;
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
    }

    public int absoluteValue(int a) {
        return Math.abs(a);
    }
    public double absoluteValue(double a) {
        return Math.abs(a);
    }
    public float absoluteValue(float a) {
        return Math.abs(a);
    }
    public long absoluteValue(long a) {
        return Math.abs(a);
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public int minimum(int a, int b) {
        return a < b ? a : b;
    }
    public double minimum(double a, double b) {
        return a < b ? a : b;
    }
    public float minimum(float a, float b) {
        return a < b ? a : b;
    }
    public long minimum(long a, long b) {
        return a < b ? a : b;
    }

    public int maximum(int a, int b) {
        return a > b ? a : b;
    }
    public double maximum(double a, double b) {
        return a > b ? a : b;
    }
    public float maximum(float a, float b) {
        return a > b ? a : b;
    }
    public long maximum(long a, long b) {
        return a > b ? a : b;
    }
}
