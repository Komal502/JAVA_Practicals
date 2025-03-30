/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JavaNBProject1.Implementation;
import com.example.JavaNBProject1.Interfaces.Vehicle;
import com.example.JavaNBProject1.Interfaces.FuelEfficient;

/**
 *
 * @author komal
 */
public class Car implements Vehicle,FuelEfficient{
    private int speed;
    private double fuelEfficiency;
    public Car(double fuelEfficiency){
        this.speed=0;
        this.fuelEfficiency=fuelEfficiency;
    }

    @Override
    public void start() {
        System.out.println("Car started...!");
    }

    @Override
    public void stop() {
        System.out.println("Car stoped....!");
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }
    
}
