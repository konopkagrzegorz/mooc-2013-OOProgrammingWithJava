/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class Counter {
    private int number;
    private boolean check;
    
    public Counter(int startingValue, boolean check) {
        this.number = startingValue;
        this.check = check;
    }
   
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    
    public Counter(boolean check) {
        this(0,true);
    }
   
    public Counter() {
        this(0,false);
    }
    
    public int value() {
        return number;
    }
    
    public void increase() {
        this.number++;
    }
    public void decrease() {
        if (this.number > 0 && check == true) {
            this.number--;
        } else {
            this.number--;
        }
    }
    
    public void increase(int increaseAmount) {
        this.number += increaseAmount;
    }
    
    public void decrease(int decreaseAmount) {
       if (check == false) {
            this.number--;
        }
        if (check == true && this.number == 0) {
            this.number = 0;
        }
        if (check == true && this.number > 0) {
            this.number--;
            if (this.number < 0) {
                this.number = 0;
            }
        }
    }
    }
