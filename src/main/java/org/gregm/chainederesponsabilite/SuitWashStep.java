package org.gregm.chainederesponsabilite;

public abstract class SuitWashStep {
    protected String step;
    protected SuitWashStep nextStep;

    public SuitWashStep(String step) {
        this.step = step;
    }

    public SuitWashStep andThen(SuitWashStep nextStep) {
        this.nextStep = nextStep;
        return nextStep;
    }
    public abstract void applyTo(Suit suit);

    public void nextStep(Suit suit){
        if (nextStep != null){
            nextStep.applyTo(suit);
        }
    }

}