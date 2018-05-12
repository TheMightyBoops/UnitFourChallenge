package MenuCreator;

/**
 * This class represents the menu generated to users during special event
 * parking.
 *
 * @version 1.0
 * @author Lucas Nolting
 */
public class OutputGarageSpecialEventReceipt implements Menu {
    private int vehicleId = 0; //look for zero for errors
    private double price = 0.0;// zero = error


    /**
     * This constructor takes in all info needed to allow a vehicle in for
     * special event parking.
     * @param vehicleId unique representation of a vehicle.
     * @param price how much the user owes.
     */
    OutputGarageSpecialEventReceipt(int vehicleId, double price) {
        this.vehicleId = vehicleId;
        this.price = price;
    }

    /**
     * @return A menu returned to the user that represents a receipt
     * for a special event.
     */
    @Override
    public String getMenu() {
        return HEADER +
                "Receipt for a vehicle id " + vehicleId + "\n" +
                "\n" +
                "Special Event" +
                "$" + String.format("%.2f", price) + "\n";
    }
}
