package vegetables;

import enums.Collor;
import enums.GrowthStatus;

public class RedCabbage extends Vegetable {
    private static final int READYFORHARVESTINCM = 29;
    private static final double LUXMODIFIER = 0.0018;
    private static final double MMMODIFIER = 0.0260;
    private static final int MAX_DAYS_WITH_RAIN = 6;
    private static final double MIN_WATER_FOR_GROWTH = 0.23;

    public RedCabbage(Collor collor, int lux, int water, int days) {
        super(collor, lux, water, days);
    }

    @Override
    public GrowthStatus statusVegetable() {
        if (days >= MAX_DAYS_WITH_RAIN && water < MIN_WATER_FOR_GROWTH) {
            return GrowthStatus.BROKEN;
        } else {
            double growLux = LUXMODIFIER * lux;
            double growWater = MMMODIFIER * water;

            size += growLux + growWater;

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
