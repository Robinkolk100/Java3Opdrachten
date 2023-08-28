package vegetables;

import enums.Collor;
import enums.GrowthStatus;

public class Carrots extends Vegetable {
    private static final int READYFORHARVESTINCM = 29;
    private static final int MAXWATERFORGROWTH = 34;
    private static final double LUXMODIFIER = 0.00001;
    private static final double MMMODIFIER = 0.0095;


    public Carrots(Collor collor, int lux, int water, int days) {
        super(collor, lux, water, days);
    }

    @Override
    public GrowthStatus statusVegetable() {
        double growLux = LUXMODIFIER * lux;
        double growWater = MMMODIFIER * water;

        if (days >= 10 && water >= MAXWATERFORGROWTH) {
            return GrowthStatus.BROKEN;
        } else {
            double totalGrow = growLux + growWater;

            size += totalGrow;

            if (size >= READYFORHARVESTINCM) {
                return GrowthStatus.READY_TO_HARVEST;
            } else {
                return GrowthStatus.Growing;
            }
        }
    }

    @Override
    public double getSize() {
        return size;
    }
}
