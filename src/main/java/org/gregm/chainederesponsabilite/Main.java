package org.gregm.chainederesponsabilite;

public class Main {
    public static void main(String[] args) {

        Suit suitToClean = new Suit();
        SuitWashStep soakstep = new SoakClothes();
        SuitWashStep washStep = new WashStep();
        SuitWashStep dryStep  = new DryStep();


        soakstep.andThen(washStep)
                .andThen(dryStep);
        suitToClean.wash(soakstep);
    }
}
