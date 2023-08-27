package vegetables;

import enums.Collor;
import enums.GrowthStatus;

public abstract class Vegetable {
int size;
int lux;
int water;
int days;
int readyForHarvestInCm;
boolean isReady;
Collor collor;

    public GrowthStatus[] GrowVegetable(int lux, int water, int days){
        this.lux = lux;
        this.water = water;
        this.days = days;
        return GrowthStatus.values();
    }

    public abstract double getSize();


}

