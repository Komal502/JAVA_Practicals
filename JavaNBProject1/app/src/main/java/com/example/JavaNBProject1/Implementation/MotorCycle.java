/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JavaNBProject1.Implementation;
import com.example.JavaNBProject1.Interfaces.Vehicle;

/**
 *
 * @author komal
 */
public class MotorCycle implements Vehicle{
    private int speed;
    
    public MotorCycle(){
        this.speed=0;
    }

    @Override
    public void start() {
        System.out.println("Vehicle Started....!");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle stoped....!");
    }

    @Override
    public int getSpeed() {
        return speed;
    }
    
}
