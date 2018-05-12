package MenuCreator;

/**
 * This class creates a menu that show the user what they owe
 * upon leaving the garage. It also shows time frames,
 * and total hours spent in the garage.
 *
 * @version 1.0
 * @author Lucas Nolting
 */
public class OutputGarageReceipt implements Menu {
    private int vehicleId = 0; //look for zero for errors
    private int hours = 0; // could also be an error, catch this in u test
    private String timeFrame = "error";
    private double price = 0.0;// zero = error


    /**
     * Constructor takes in all reaquired info from factory to create a
     * menu instance.
     *
     * @param vehicleId unique vehicle ID
     * @param hours hours spent in garage
     * @param timeFrame string representation of time spent in garage.
     * @param price how much the user owes
     */
    OutputGarageReceipt(int vehicleId, int hours, String timeFrame, double price) {
        this.vehicleId = vehicleId;
        this.hours = hours;
        this.timeFrame = timeFrame;
        this.price = price;
    }

    /**
     * @return menu of the receipt to display to the user.
     */
    @Override
    public String getMenu() {
        return HEADER +
                "Receipt for vehicle id " + vehicleId + "\n" +
                hours + "hour(s) parked " + timeFrame + "\n" +
                "$" + String.format("%.2f", price);
    }
}
