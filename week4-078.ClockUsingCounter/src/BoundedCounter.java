/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class BoundedCounter {
    
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }
    
    public void next() {
        if (this.value == upperLimit) {
            this.value = 0;
        } else {
        this.value++;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        if (newValue >= 0 && newValue <= this.upperLimit) {
        this.value = newValue;
        }
    }

    @Override
    public String toString() {
        if (value < 10) {
            return "0" + value;
        }
        return "" + value;
    }
}