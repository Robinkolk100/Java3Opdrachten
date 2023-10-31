public class Generator extends Controlroom {
    private double stroomtotaal;
    public double genereerEnergie(double stoom) {
        double gegenereerdeEnergie = stoom * 8;
        stroomtotaal += gegenereerdeEnergie;
        return gegenereerdeEnergie;
    }
    public double getStroomtotaal(){
        return  stroomtotaal;
    }

    @Override
    public Statuses getstatus() {
        if (stroomtotaal > 564){
            return Statuses.UNSTABLE;
        }
        else {
            return Statuses.STABLE;
        }
    }
}
