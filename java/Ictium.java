public class Ictium extends Core{
    @Override
    public SplitResult split(double tempInKelvin, double timeInSeconds) {
        double decreasePercentageBy;
        double steam;
        double residualHeat;
        double timeInSecondsBeforeEmpty;

        if(!(tempInKelvin < 334)) {
            decreasePercentageBy = 0.00008 * tempInKelvin * timeInSeconds + 0.000003;
            this.decreasePercentage(decreasePercentageBy);
        }

        timeInSecondsBeforeEmpty = (( 100 - 0.00003 ) / tempInKelvin) / 0.0008;
        steam = 50 * tempInKelvin;
        residualHeat = (timeInSecondsBeforeEmpty / 0.7) * 23;

        SplitResult result = new SplitResult(residualHeat, steam);
        return result;

    }
}
