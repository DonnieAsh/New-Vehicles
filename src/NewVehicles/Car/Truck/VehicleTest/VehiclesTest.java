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
// Tester
public class VehiclesTest {
    public static void main(String[] args) {
        
        CarFactory FordCarFactory = FactoryProducer.getCarFactory("ford");
        Car Focus = FordCarFactory.createCar("Focus");
        Focus.drive();
        
        Car Mustang = FordCarFactory.createCar("Mustang");
        Mustang.drive();
        
        CarFactory ToyotaCarFactory = FactoryProducer.getCarFactory("toyota");
        Car Corolla = ToyotaCarFactory.createCar("Corolla");
        Corolla.drive();
        
        Car Prius = ToyotaCarFactory.createCar("Prius");
        Prius.drive();
		
	TruckFactory FordTruckFactory = FactoryProducer.getTruckFactory("ford");
        Truck f150 = FordTruckFactory.createTruck("F150");
        f150.drive();
		
	TruckFactory ToyotaTruckFactory = FactoryProducer.getTruckFactory("toyota");
        Truck Tacoma = ToyotaTruckFactory.createTruck("Tacoma");
        Tacoma.drive();
        
    }
}
