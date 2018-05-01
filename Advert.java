package com.company;

public class Advert {
    private int estimatedAdvertCost;
    private int actualAdvertCost;

    public Advert(int estimatedAdvertCost, int actualAdvertCost) {
        this.estimatedAdvertCost = estimatedAdvertCost;
        this.actualAdvertCost = actualAdvertCost;
    }

    public int getCost(){
        return this.actualAdvertCost;
    }

    public int getEstimatedAdvertCost() {
        return this.estimatedAdvertCost;
    }

    public int getActualAdvertCost() {
        return this.actualAdvertCost;
    }
}
