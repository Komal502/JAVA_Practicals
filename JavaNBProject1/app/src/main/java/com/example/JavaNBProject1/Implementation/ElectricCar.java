/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JavaNBProject1.Implementation;
import com.example.JavaNBProject1.Interfaces.*;

/**
 *
 * @author komal
 */
public class ElectricCar implements Vehicle,FuelEfficient,Electric{
    private int speed;
    private double fuelEfficiency;
    private int batteryLevel;
    
    public ElectricCar(double fuelEfficiency){
        this.speed=0;
        this.fuelEfficiency=fuelEfficiency;
        this.batteryLevel=100;
    }
    @Override
    public void start() {
        System.out.println("Electric car started....!");
    }

    @Override
    public void stop() {
        System.out.println("Electric car stoped....!");
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public void chargeBatteryLevel() {
        System.out.println("Charging battery....!");
    }
    
    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

}
