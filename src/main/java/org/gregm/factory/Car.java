package org.gregm.factory;

public class Car extends Vehicule{
    public Car(VehiculeColor couleur) {
        super(couleur);
    }

    @Override
    public void rouler() {
        System.out.println("La voiture " + couleur + " roule...");
    }
}
