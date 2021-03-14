package ru.sberbank.java.scool.labwork2;

import java.util.function.DoublePredicate;
import java.util.function.DoubleUnaryOperator;

public class DoubleEx {

    private double value;

    public double getValue() {
        return value;
    }

    private void checkZerro(Number val) throws ArithmeticException {
        if ((val instanceof Integer) & (val.intValue() == 0))
            throw new ArithmeticException();
    }

    private DoubleEx func(Number val, DoublePredicate dp, DoubleUnaryOperator df) {
        double value = val.doubleValue();
        return dp.test(value) ? this : new DoubleEx(df.applyAsDouble(value));
    }

    public DoubleEx(Number value) {
        this.value = value.doubleValue();
    }

    public DoubleEx add(Number val) {
        return func(val, (p) -> p == 0, (a) -> this.getValue() + a);
    }

    public DoubleEx subtract(Number val) {
        return func(val, (p) -> p == 0, (s) -> this.getValue() - s);
    }

    public DoubleEx multiply(Number val) {
        return func(val, (p) -> p == 1, (s) -> this.getValue() * s);
    }

    public DoubleEx divide(Number val) throws ArithmeticException {
        checkZerro(val);
        return func(val, (p) -> p == 1, (s) -> this.getValue() / s);
    }

    public DoubleEx mod(Number val) throws ArithmeticException {
        checkZerro(val);
        return func(val, (p) -> p == 1, (s) -> this.getValue() % s);
    }

    public DoubleEx pow(Number val) {
        return new DoubleEx(Math.pow(getValue(), val.doubleValue()));
    }

    public DoubleEx max(Number val) {
        return getValue() >= val.doubleValue() ? this : new DoubleEx(val.doubleValue());
    }

}
