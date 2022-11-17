public class Generator {
    private double totalYieldInKwh;

    public Generator() {
        this.totalYieldInKwh = 0;
    }

    public double getTotalYieldInKwh() {
        return this.totalYieldInKwh;
    }

    public double generateEnergy(double steam) {
        double energy = steam * 12;
        this.totalYieldInKwh += energy;
        return energy;
    }
}
