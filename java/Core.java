public abstract class Core {
    public final double CORE_FULL = 100;

    private double remainingPercentage;

    public Core() {
        this.remainingPercentage = CORE_FULL;
    }

    public void decreasePercentage(double decreasePercentageBy) {
        this.remainingPercentage -= remainingPercentage;
    }

    public abstract SplitResult split(double tempInKelvin, double timeInSeconds);
}
