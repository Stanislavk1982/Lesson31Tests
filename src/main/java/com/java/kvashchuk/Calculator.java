package com.java.kvashchuk;

public class Calculator {

    public int add(int op1, int op2) {
        int result = op1 + op2;
        return result;
    }

    public int substract(int op1, int op2) {
        int result = op1 - op2;
        return result;
    }

    public int divide(int op1, int op2) throws DivizionByZero {
        if (op2 == 0) {
            throw new DivizionByZero("Division by Zero");
        }
        int result = op1 / op2;
        return result;
    }
}
