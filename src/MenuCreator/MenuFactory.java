package MenuCreator;


/**
 * This class handles which menus need which type of signature
 * based on all the data they are required to display. If they
 * require similar data they are put through a case statement
 * for a more specific menu
 * @version 1.0
 * @author Lucas Nolting
 */
public class MenuFactory {


    /**
     * This method creates menus that require no additional data
     * to be sent to the menu for display.
     *
     * @param desiredMenu name from enum to specify specific menu.
     *
     * @return object of desired menu.
     */
    public static Menu createMenu(MenuChoice desiredMenu) {

        switch (desiredMenu) {
            // Inputs Go Here in Case
            case INPUT_MAIN_MENU:
                return new InputMainMenu();

            case INPUT_SUBMIT_PARKING_TICKET:
                return new InputSubmitParkingTicket();

                default: return new InputMainMenu();
        }
    }


    /**
     * Creates menus that require an id and price(most of the tickets that
     * have singular prices).
     *
     * @param desiredMenu name from enum to specify Menu.
     * @param vehicleId unique vehicle Id.
     * @param price how much the user will owe when this menu outputs.
     *
     * @return instance of desired menu
     */
    // I split these because the outputs need special constructors
    public static Menu createMenu(MenuChoice desiredMenu, int vehicleId, double price) {
        switch (desiredMenu) {
            case OUTPUT_SPECIAL_EVENT_RECEIPT:
                return new OutputGarageSpecialEventReceipt(vehicleId,price);

            case OUTPUT_LOST_TICKET_RECEIPT:
                return new OutputLostTicketReceipt(vehicleId, price);
            default: return new InputMainMenu();
        }
    }

    /**
     * Method to pass and instance the menu for a regular ticket
     *
     * @param vehicleId unique id given to vehicle entering garage.
     * @param hours The total hours a user has spent in the garage so it
     * can be printed on the menu.
     * @param timeFrame the two times displayed on the tickets to tell
     * the user when they arrived and when they left.
     * @param price The amount of money owed by the user.
     *
     * @return Menu that displays the users receipt on leaving the garage.
     */
    //Regular Tickets
    public static Menu createMenu(int vehicleId, int hours, String timeFrame, double price) {
        return new OutputGarageReceipt(vehicleId, hours, timeFrame, price);
    }

    /**
     * Method to pass and instance the menu of the end of day report
     * viewed by garage admin.
     *
     * @param pricesToDisplayAndTotal list of all the transactions from throughout the
     * day.
     * @param ticketsByType Totals of each type of ticket for display on the menu.
     *
     * @return Menu of the end of day report.
     */
    //End of Day Report
    public static Menu createMenu(double[] pricesToDisplayAndTotal, int[] ticketsByType) {
        return new OutputGarageClosedReport(pricesToDisplayAndTotal, ticketsByType);
    }
}
