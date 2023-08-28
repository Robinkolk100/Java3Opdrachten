package vegetables;

import enums.Collor;
import enums.GrowthStatus;

public class Pepper extends Vegetable {
    private static final int READYFORHARVESTINCM = 5;
    private static final int MAX_DAYS_WITH_RAIN = 6;
    private static final int MAX_RAIN_MM = 48;
    private static final int MIN_LUX_FOR_GROWTH = 7398;
    private static final double LUXMODIFIER = 0.000001;
    private static final double MMMODIFIER = 0.0015;

    public Pepper(Collor collor, int lux, int water, int days) {
        super(collor, lux, water, days);
    }

    @Override
    public GrowthStatus statusVegetable() {
        double growLux = LUXMODIFIER * lux;
        double growWater = MMMODIFIER * water;

        size += growLux + growWater;

        if (days >= MAX_DAYS_WITH_RAIN && water >= MAX_RAIN_MM) {
            return GrowthStatus.BROKEN;
        } else if (lux < MIN_LUX_FOR_GROWTH) {
            return GrowthStatus.NOT_GROWING;
        } else if (size >= READYFORHARVESTINCM) {
            return GrowthStatus.READY_TO_HARVEST;
        } else {
            return GrowthStatus.Growing;
        }
    }

    @Override
    public double getSize() {
        return size;
    }
}
