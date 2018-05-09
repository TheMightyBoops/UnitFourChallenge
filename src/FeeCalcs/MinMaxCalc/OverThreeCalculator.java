package FeeCalcs.MinMaxCalc;

/**
 * This class is instanced if a user has been in the parking
 * garage for over three hours
 *
 * @version 1.0
 * @author Lucas Nolting
 */
public class OverThreeCalculator implements Calculable {

    /**
     * Implementation of interface to create a unique style of payment.
     *
     * @param hours how many hours has a user spent in a given place
     *
     * @return what's owed from the customer given the hours.
     */
    @Override
    public double calculatePrice(int hours) {
        return 5 + (hours-3);
    }
}
