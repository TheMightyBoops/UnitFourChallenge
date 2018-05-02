package FeeCalcs.MinMaxCalc;

public class OverThreeCalculator implements Calculable {


    @Override
    public double calculatePrice(int hours) {
        return 5 + (hours-3);
    }
}
