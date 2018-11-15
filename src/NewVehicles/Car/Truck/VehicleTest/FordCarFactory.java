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
public class FordCarFactory implements CarFactory{
    @Override
    public Car createCar(String carType) {
        
        if("Focus".equalsIgnoreCase(carType)) {
            return new Focus();
        }  
        if("Mustang".equalsIgnoreCase(carType)) {
            return new Mustang();
        }
        return null;
    }
}
