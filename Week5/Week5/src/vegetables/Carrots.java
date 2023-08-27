package vegetables;

import enums.Collor;
import enums.GrowthStatus;

public class Carrots extends Vegetable {
    private final static int READYFORHARVESTINCM = 29;
    private final static int MAXWATERFORGROWTH = 34;


    public Carrots(Collor collor, int lux, int water, int days) {
        super(collor, lux, water, days);
    }

    @Override
    public GrowthStatus statusVegetable() {
        double growLux = 0.00001 * lux;
        double growWater = 0.0095 * water;

        if (days >= 10 && water >= MAXWATERFORGROWTH) {
            // Geen groei als aan de voorwaarden wordt voldaan
            return GrowthStatus.BROKEN; // Of een andere geschikte status
        } else {
            double totalGrow = growLux + growWater;

            size += totalGrow;

            if (size >= READYFORHARVESTINCM) {
                isReady = true;
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
