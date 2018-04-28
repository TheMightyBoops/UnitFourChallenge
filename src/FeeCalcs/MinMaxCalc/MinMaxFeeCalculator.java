package FeeCalcs.MinMaxCalc;

public class MinMaxFeeCalculator {
    private Calculable minMaxCalculator;
    private int hoursParked;
    private int id;

    public MinMaxFeeCalculator(int id, int hoursParked) {
        this.id = id;
        this.hoursParked = hoursParked;
        if(hoursParked > 3) {
            minMaxCalculator = new OverThreeCalculator();
        } else {
            minMaxCalculator = new UnderThreeCalculator();
        }
    }

    public double getFee() {
        return minMaxCalculator.calculatePrice(hoursParked);
    }

    public  int getId() {
        return id;
    }
}
