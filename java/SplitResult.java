public class SplitResult {
    private double residualHeat;
    private double steam;

    public SplitResult(double residualHeat, double steam) {
        this.residualHeat = residualHeat;
        this.steam = steam;
    }

    public double getResidualHeat() {
        return residualHeat;
    }

    public double getSteam() {
        return steam;
    }
}
