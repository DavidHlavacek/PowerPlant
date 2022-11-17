public class Nhlium extends Core{
    @Override
    public SplitResult split(double tempInKelvin, double timeInSeconds) {
        double decreasePercentageBy;
        double steam;
        double residualHeat;

        decreasePercentageBy = 0.08 * timeInSeconds;
        this.decreasePercentage(decreasePercentageBy);
        if(tempInKelvin < 328) {
            steam = (tempInKelvin / 80) * timeInSeconds * 0.7;
            residualHeat = timeInSeconds * 9;
        } else {
            steam = 0.8 * ((tempInKelvin * 0.6) / timeInSeconds) * Math.sqrt(4) * timeInSeconds;
            residualHeat = tempInKelvin / 0.8;
        }

        SplitResult result = new SplitResult(residualHeat, steam);
        return result;
    }
}
