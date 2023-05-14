package org.gregm.factory;

public class Main {
    public static void main(String[] args) {
        Vehicule car = VehiculeFactory.createVehicle(VehiculeType.CAR,VehiculeColor.PURPLE);
        car.rouler();
        Vehicule car2 = VehiculeFactory.createVehicle(VehiculeType.CAR,VehiculeColor.YELLOW);
        car2.rouler();
        Vehicule car3 = VehiculeFactory.createVehicle(VehiculeType.CAR,VehiculeColor.BLACK);
        car3.rouler();

        Vehicule truck = VehiculeFactory.createVehicle(VehiculeType.TRUCK,VehiculeColor.MARRON);
        truck.rouler();
        Vehicule truck2 = VehiculeFactory.createVehicle(VehiculeType.TRUCK,VehiculeColor.BLUE);
        truck2.rouler();
        Vehicule truck3 = VehiculeFactory.createVehicle(VehiculeType.TRUCK,VehiculeColor.WHITE);
        truck3.rouler();

        Vehicule bus = VehiculeFactory.createVehicle(VehiculeType.BUS,VehiculeColor.RED);
        bus.rouler();
        Vehicule bus2 = VehiculeFactory.createVehicle(VehiculeType.BUS,VehiculeColor.BEIGE);
        bus2.rouler();
        Vehicule bus3 = VehiculeFactory.createVehicle(VehiculeType.BUS,VehiculeColor.PINK);
        bus3.rouler();
    }
}
