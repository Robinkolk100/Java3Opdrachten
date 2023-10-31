public class Koelsysteem extends Controlroom{
    private double waterTemperatuur = 0;

    public double getWaterTemperatuur() {
        return waterTemperatuur;
    }

    public void setWaterTemperatuur(double waterTemperatuur) {
        this.waterTemperatuur = waterTemperatuur;
    }

    public void ontVoerRestWarmte(double restwarmte){
        waterTemperatuur =  restwarmte * 0.8;
    }

    @Override
    public Statuses getstatus() {
        if (waterTemperatuur > 369){
            return Statuses.UNSTABLE;
        } else if (waterTemperatuur > 255 && waterTemperatuur < 369) {
            return Statuses.ATTENTION;
        }
        return Statuses.STABLE;
    }
}
