package org.gregm.factory;

import static org.gregm.factory.VehiculeType.BUS;

public class VehiculeFactory {
    public static Vehicule createVehicle(VehiculeType type, VehiculeColor color) {
        switch(type) {
            case BUS:
                return new Bus(color);
            case CAR:
                return new Car(color);
            case TRUCK:
                return new Truck(color);
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}
