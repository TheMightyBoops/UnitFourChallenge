package MenuCreator;

/**
 * This class represents what a user sees when they report to the
 * machine that they have lost heir parking ticket. i
 *
 * @version 1.0
 * @author Lucas Nolting
 */
public class OutputLostTicketReceipt implements Menu {

    private int vehicleId = 0; //look for zero for errors
    private double price = 0.0;// zero = error

    /**
     * Constructor for building the lost ticket menu.
     *
     * @param vehicleId unique identifier for a vehicle.
     * @param price how much the user owes for losing a
     * ticket.
     */
    public OutputLostTicketReceipt(int vehicleId, double price) {
        this.vehicleId = vehicleId;
        this.price = price;
    }

    /**
     * @return a receipt for the user to see how much they owe.
     */
    @Override
    public String getMenu() {
        return HEADER +
                "Receipt for a vehicle id " + vehicleId + "\n" +
                " \n" +
                "Lost Ticket\n" +
                "$" + String.format("%.2f", price) + "\n";
    }
}
