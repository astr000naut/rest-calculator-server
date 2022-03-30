package com.greeting.rest;

public class PostBody {
    private double firstNum;
    private double secondNum;
    private String operator;
    PostBody() {};
    public double getFirstNum() {
        return firstNum;
    }
    public double getSecondNum() {
        return secondNum;
    }
    public String getOperator() {
        return operator;
    }
}
