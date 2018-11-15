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
public class ToyotaTruckFactory implements TruckFactory {
    
    @Override
    public Truck createTruck(String trucktype) {
        
        if("tacoma".equalsIgnoreCase(trucktype)) {
            return new Tacoma();
        }  
        return null;
    }
}
