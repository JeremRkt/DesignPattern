package org.gregm.factory;

public class Bus extends Vehicule{

    public Bus(VehiculeColor couleur) {
        super(couleur);
    }

    @Override
    public void rouler() {
        System.out.println("Le bus " + couleur + " roule...");
    }
}
