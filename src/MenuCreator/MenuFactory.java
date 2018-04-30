package MenuCreator;


/* --Conventions for adding menus--
 * [input|output][menuName]
 * ex. outputGarageReceipt
 * */
public class MenuFactory {


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

    //Regular Tickets
    public static Menu createMenu(int vehicleId, int hours, String timeFrame, double price) {
        return new OutputGarageReceipt(vehicleId, hours, timeFrame, price);
    }

    //End of Day Report
    public static Menu createMenu(double[] pricesToDisplayAndTotal, int[] ticketsByType) {
        return new OutputGarageClosedReport(pricesToDisplayAndTotal, ticketsByType);
    }
}
