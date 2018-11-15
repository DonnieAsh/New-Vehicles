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
public class KiaSUVFactory implements SUVFactory {
    
    @Override
    public SUV createSUV(String SUVType) {
        
        if("santafe".equalsIgnoreCase(SUVType)) {
            return new SantaFe();
        }  
        return null;
    }
}
