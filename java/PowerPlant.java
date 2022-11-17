import java.util.Iterator;

public class PowerPlant {
    private Generator generator;
    private Reactor reactor;
    private CoolingSystem coolingSystem;

    public PowerPlant(Generator generator, Reactor reactor, CoolingSystem coolingSystem) {
        this.generator = generator;
        this.reactor = reactor;
        this.coolingSystem = coolingSystem;
    }

    public double Run(double temp, int time) {
        Iterator<Core> cores = reactor.getCores();
        while(cores.hasNext()) {
            SplitResult result = cores.next().split(temp, time);
            generator.generateEnergy(result.getSteam());
            coolingSystem.abductResidualHeat(result.getResidualHeat());
        }

        return generator.getTotalYieldInKwh();
    }
}
