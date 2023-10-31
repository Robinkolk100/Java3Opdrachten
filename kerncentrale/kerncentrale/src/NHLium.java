public class NHLium implements Splijtstaaf {
    private double restpercentage = 100;
    private double stoom = 0;
    private double restwarmte = 0;

    @Override
    public double split(double tijd, double temp) throws MeltdownException {
        if ((tijd > 59 && temp > 368) || restpercentage < 0.1){
            throw new MeltdownException();
        }
        if (temp < 350) {
            stoom = temp / 80 * tijd * 0.8;
            restwarmte = tijd * 5;
        } else {
            stoom = 0.8 * (temp * 0.7) / tijd * Math.sqrt(9) * tijd;
            restwarmte = temp / 0.4;
        }
        return restpercentage - 0.06 * tijd;
    }
    @Override
    public double getRestpercentage() {
        return restpercentage;
    }


    @Override
    public double getStoom() {
        return stoom;
    }

    @Override
    public double getRestWarmte() {
        return restwarmte;
    }
}
