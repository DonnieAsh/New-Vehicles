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
public class FordTruckFactory implements TruckFactory{
    
    @Override
    public Truck createTruck(String truckType) {
        
        if("f150".equalsIgnoreCase(truckType)) {
            return new F150();
        }  
        return null;
    }
}
