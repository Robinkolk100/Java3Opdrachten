import java.util.ArrayList;
import java.util.List;

public class Reactor extends Controlroom {
    private List<Splijtstaaf> kernen = new ArrayList<>();
    private double totaleStoom;
    private double totaleRestWarmte;
    public Reactor() {
        kernen.add(new Laptopium());
        kernen.add(new Laptopium());
        kernen.add(new NHLium());
        kernen.add(new NHLium());
    }

    public void splitKernen(double tijd, double temp){
        for (Splijtstaaf kern : kernen){
            try{
                kern.split(tijd, temp);
                totaleStoom += kern.getStoom();
                totaleRestWarmte += kern.getRestWarmte();
            }
            catch (MeltdownException exception){
                System.out.println("Issue ");
            }

        }
    }

    @Override
    public Statuses getstatus() {
        for (Splijtstaaf kern : kernen) {
            if (kern.getRestpercentage() < 0.1) {
                return Statuses.ATTENTION;
            }
        }
        return Statuses.STABLE;
    }

    public double getTotaleStoom(){
        return totaleStoom;
    }
    public double getTotaleRestWarmte(){
        return totaleRestWarmte;
    }
}
