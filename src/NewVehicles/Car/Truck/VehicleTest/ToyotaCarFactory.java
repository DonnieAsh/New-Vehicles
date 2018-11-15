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
public class ToyotaCarFactory implements CarFactory{
    
    @Override
    public Car createCar(String cartype) {
        
        if("Corolla".equalsIgnoreCase(cartype)) {
            return new Corolla();
        }  
        if("Prius".equalsIgnoreCase(cartype)) {
            return new Prius();
        }
        return null;
    }
}
