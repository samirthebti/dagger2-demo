package com.thesam.dagger_2_demo;

/**
 * Created by Samir Thebti  on 6/12/16.
 * ----->> thebtisam@gmail.com <<-----
 */
public class Vehicle {

    private Motor motor;

    public Vehicle(Motor motor){
        this.motor = motor;
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){
        return motor.getRpm();
    }
}