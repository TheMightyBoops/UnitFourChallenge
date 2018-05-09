package FeeCalcs.MinMaxCalc;
/**
 * This class is in charge of instancing types of the
 * calculator based on how long the user has been in the
 * garage.
 *
 * @version 1.0
 * @author Lucas Nolting
 */
public class MinMaxFeeCalculator {
    private Calculable minMaxCalculator;
    private int hoursParked;
    private int id;

    /**
     * This constructor turns the declared Calculable into a
     * more specific type of calculator based on if a user has parked
     * more or less than 3 hours.
     *
     * @param id unique id for a given transaction.
     * @param hoursParked how many hours the customer has parked in the garage
     */
    public MinMaxFeeCalculator(int id, int hoursParked) {
        this.id = id;
        this.hoursParked = hoursParked;
        if(hoursParked > 3) {
            minMaxCalculator = new OverThreeCalculator();
        } else {
            minMaxCalculator = new UnderThreeCalculator();
        }
    }

    /**
     * @return the amount the customer owes
     */
    public double getFee() {
        return minMaxCalculator.calculatePrice(hoursParked);
    }

    /**
     * @return the id of the transaction.
     */
    public  int getId() {
        return id;
    }
}
