package com.thesam.dagger_2_demo;

/**
 * Created by Samir Thebti  on 6/12/16.
 * ----->> thebtisam@gmail.com <<-----
 */
public class Motor {

    private int rpm;

    public Motor(){
        this.rpm = 0;
    }

    public int getRpm(){
        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }
}