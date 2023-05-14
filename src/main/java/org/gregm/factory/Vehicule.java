package org.gregm.factory;

public abstract class Vehicule {
    protected VehiculeColor couleur;

    public Vehicule(VehiculeColor couleur){
        this.couleur = couleur;
    }

    public abstract void rouler();
}
