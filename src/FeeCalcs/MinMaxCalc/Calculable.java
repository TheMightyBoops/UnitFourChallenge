package FeeCalcs.MinMaxCalc;
/**
 * This interface follows a strategy style pattern, and allows
 * the various classes in this package to inherit the behavior
 * of calculating a price given different data.
 *
 * @version 1.0
 * @author Lucas Nolting
 */
public interface Calculable {
    //public double calculatePrice();

    /**
     * Adds a behavior to a class to calculate a price based on
     * time spent in a specific state (in this case time in a
     * parking garage)
     *
     * @param hours how many hours has a user spent in a given place
     * @return how much the user will owe based on hours input into
     * this method.
     */
    double calculatePrice(int hours);

}
