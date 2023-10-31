public class Laptopium implements Splijtstaaf {
    private double restpercentage = 100;
    private double stoom = 0;
    private double restwarmte = 0;

    @Override
    public double split(double tijd, double temp) throws MeltdownException {
        if (temp > 424){
            throw new MeltdownException();
        }
        stoom = 44 * temp;
        restwarmte = tijd / 0.5 * 18;

        if (temp > 321){
            restpercentage = restpercentage - (0.00004 * temp * tijd) + 0.0002;
        }
        return restpercentage;
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
