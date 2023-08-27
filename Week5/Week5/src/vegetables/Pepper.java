package vegetables;

import enums.GrowthStatus;

public class Pepper extends Vegetable{
    private final static int readyForHarvestInCm = 5;
    private final static int MAXDAYS = 6;
    private final static int MAXDAYSRAIN = 48;
    private final static int MINLUXGROW = 7398;
    @Override
    public GrowthStatus[] GrowVegetable(int lux, int water, int days) {
        super.GrowVegetable(lux, water, days);

        if(MAXDAYS >= days && MAXDAYSRAIN > water){
            return new GrowthStatus[]{GrowthStatus.BROKEN};
        } else if (lux < MINLUXGROW) {
            return new GrowthStatus[]{GrowthStatus.NOT_GROWING};
        }

        return new GrowthStatus[0];
    }
    @Override
    public double getSize() {
        return size;
    }
}
