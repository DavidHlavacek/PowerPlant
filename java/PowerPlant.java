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
        double totalKwh = 0;
        Iterator<Core> cores = reactor.getCores();
        while(cores.hasNext()) {
            SplitResult result = cores.next().split(temp, time);
            totalKwh += generator.generateEnergy(result.getSteam());
            coolingSystem.abductResidualHeat(result.getResidualHeat());
        }

        return totalKwh;
        //Not this as this is the result for all the runs
        //return generator.getTotalYieldInKwh();
    }
}
