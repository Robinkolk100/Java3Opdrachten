
public class Centrale {
    public double run(double temp, double tijd){
        Reactor reactor = new Reactor();
        Generator generator = new Generator();
        Koelsysteem koelsysteem = new Koelsysteem();
        Controlroom controlroom = new Controlroom();

        reactor.splitKernen(tijd, temp);

        generator.genereerEnergie(reactor.getTotaleStoom());

        koelsysteem.ontVoerRestWarmte(reactor.getTotaleRestWarmte());

        System.out.println(controlroom.isNuclearReactorStable(generator, reactor, koelsysteem));

        return generator.getStroomtotaal();
    }
}