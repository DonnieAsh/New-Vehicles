/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewVehicles.Car.Truck.VehicleTest;

/**
 *
 * @author allst
 */
public class Acadia implements SUV{
    int year1 = 2018;
    int year2 = 2017;
    int year3 = 2016;
    
    @Override
    public void drive() {
        System.out.println("Driving a " + year1 + " Acadia. Great!");
    }
}
