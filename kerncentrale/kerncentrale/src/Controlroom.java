public class Controlroom {
    public Statuses getstatus() {
        return Statuses.STABLE;
    }
    public boolean isNuclearReactorStable(Generator generator, Reactor reactor, Koelsysteem koelsysteem){
        if (generator.getstatus() != Statuses.STABLE){
            return false;
        }
        if (koelsysteem.getstatus() != Statuses.STABLE){
            return false;
        }
        if (reactor.getstatus() != Statuses.STABLE){
            return false;
        }
        return true;
    }
}
