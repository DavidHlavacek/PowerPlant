public class CoolingSystem {
    private double waterTemp;

    public CoolingSystem() {
        this.waterTemp = 0;
    }

    public double getWaterTemp() {
        return waterTemp;
    }

    public void abductResidualHeat(double residualHeat) {
        waterTemp = residualHeat * 0.4;
    }

}
