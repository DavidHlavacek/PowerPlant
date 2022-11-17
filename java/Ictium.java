public class Ictium extends Core{
    @Override
    public SplitResult split(double tempInKelvin, double timeInSeconds) {
        double decreasePercentageBy;
        double steam;
        double residualHeat;

        if(!(tempInKelvin < 334)) {
            decreasePercentageBy = 0.00008 * tempInKelvin * timeInSeconds + 0.000003;
        }

        steam = 50 * tempInKelvin;
        residualHeat = (timeInSeconds / 0.7) * 23;

        SplitResult result = new SplitResult(residualHeat, steam);
        return result;

    }
}
