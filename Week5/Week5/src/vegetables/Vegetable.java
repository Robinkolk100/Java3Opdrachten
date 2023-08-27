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

    public Vegetable(Collor collor, int lux, int water, int days){
        this.collor = collor;
        this.lux = lux;
        this.water = water;
        this.days = days;

    }

    public abstract GrowthStatus statusVegetable();

    public abstract double getSize();


}

