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
public class Corolla implements Car{
    String color1 = "red";
    String color2 = "black";
    String color3 = "silver";
   
    
    @Override
    public void drive() {
        System.out.println("Driving a " + color2 + " Corolla down the street." );
    }
}
