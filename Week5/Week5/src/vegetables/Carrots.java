package vegetables;

import enums.GrowthStatus;

public class Carrots extends Vegetable {
    private final static int readyForHarvestInCm = 29;
    private final static int maxWaterForGrowth = 34;

    @Override
    public GrowthStatus[] GrowVegetable(int lux, int water, int days) {
        super.GrowVegetable(lux, water, days);

        double growLux = 0.00001 * lux;
        double growWater = 0.0095 * water;

        if(days >= 10 &&  water >= maxWaterForGrowth){
            return new GrowthStatus[]{GrowthStatus.NOT_GROWING};
        }
        else {

            double totalGrow = growLux + growWater;

            size += totalGrow;

            if (size >= readyForHarvestInCm) {
                return new GrowthStatus[]{GrowthStatus.READY_TO_HARVEST};
            }
        }
        return new GrowthStatus[]{GrowthStatus.Growing};
    }
    @Override
    public double getSize() {
        return size;
    }

}
