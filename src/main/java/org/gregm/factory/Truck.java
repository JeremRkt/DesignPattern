package org.gregm.factory;

public class Truck extends Vehicule{
    public Truck(VehiculeColor couleur) {
        super(couleur);
    }

    @Override
    public void rouler() {
        System.out.println("Le camion " + couleur + " roule...");
    }
}
