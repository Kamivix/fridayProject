package com.example.fridayproject.dto;

public class MessageDto {

    private double valueOne;
    private double valueTwo;
    private int decimalPlaces;
    private int multiplier;

    public MessageDto(double valueOne, double valueTwo, int decimalPlaces, int multiplier) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.decimalPlaces = decimalPlaces;
        this.multiplier = multiplier;
    }

    public double getValueOne() {
        return valueOne;
    }

    public void setValueOne(double valueOne) {
        this.valueOne = valueOne;
    }

    public double getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(double valueTwo) {
        this.valueTwo = valueTwo;
    }

    public int getDecimalPlaces() {
        return decimalPlaces;
    }

    public void setDecimalPlaces(int decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }
}
