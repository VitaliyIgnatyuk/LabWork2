package ru.sberbank.java.scool.labwork2;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        DoubleEx val = new DoubleEx(10);
        out.printf("10 + 5 = %f\n", val.add(5).getValue());
        out.printf("10 - 0.5 = %f\n", val.subtract(0.5).getValue());
        out.printf("10 * 1.9999999 = %f\n", val.multiply(1.9999999).getValue());
        out.printf("10 / 0.0 = %f\n", val.divide(0.0).getValue());
        out.printf("10 %% 3 = %f\n", val.mod(3).getValue());
        out.printf("10 ^ 5 = %f\n", val.pow(5).getValue());
        out.printf("max(10, 11) = %f\n", val.max(11).getValue());
        DoubleEx val2 = new DoubleEx(null);
    }
}
