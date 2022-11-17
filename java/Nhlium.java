public class Nhlium extends Core{
    @Override
    public SplitResult split(double tempInKelvin, double timeInSeconds) {
        double decreasePercentageBy;
        double steam;
        double residualHeat;
        double timeInSecondsBeforeEmpty;

        decreasePercentageBy = 0.08 * timeInSeconds;
        this.decreasePercentage(decreasePercentageBy);
        timeInSecondsBeforeEmpty = 100 / 0.8;

        if(tempInKelvin < 328) {
            steam = (tempInKelvin / 80) * timeInSecondsBeforeEmpty * 0.7;
            residualHeat = timeInSecondsBeforeEmpty * 9;
        } else {
            steam = 0.8 * ((tempInKelvin * 0.6) / timeInSecondsBeforeEmpty) * Math.sqrt(4) * timeInSecondsBeforeEmpty;
            residualHeat = tempInKelvin / 0.8;
        }

        SplitResult result = new SplitResult(residualHeat, steam);
        return result;
    }
}
