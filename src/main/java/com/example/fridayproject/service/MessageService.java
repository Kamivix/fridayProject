package com.example.fridayproject.service;

import com.example.fridayproject.dto.MessageDto;
import org.decimal4j.util.DoubleRounder;
import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class MessageService {

    private double valueOne;
    private double valueTwo;
    private int decimalPlaces;
    private int multiplier;

    MessageService(){
        decimalPlaces=2;
        multiplier=1;
    }

    public void setDecimalPlaces(int decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    public int getDecimalPlaces() {
        return decimalPlaces;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    private void calculateValue(){
        Random random = new Random();
        valueOne = DoubleRounder.round(((0.0 + random.nextDouble())*multiplier),decimalPlaces);
        valueTwo=DoubleRounder.round(((0.0 + random.nextDouble())*multiplier),decimalPlaces);
    }

    public MessageDto getValues(){
        calculateValue();
        return new MessageDto(valueOne,valueTwo,decimalPlaces,multiplier);
    }
}
