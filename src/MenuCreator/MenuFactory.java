package MenuCreator;



/* --Conventions for adding menus--
 * [input|output][menuName]
 * ex. outputGarageReceipt
 * */
public class MenuFactory {


    public static Menu createMenu(String desiredMenu) {

        switch (desiredMenu) {
            // Inputs Go Here in Case
            case "inputMainMenu":
                return new InputMainMenu();

            case "inputSubmitParkingTicket":
                return new InputSubmitParkingTicket();

                default: return new InputMainMenu();
        }
    }

    // I split these because the outputs need special constructors
    public static Menu createMenu(String desiredMenu, int vehicleId, double price) {
        switch (desiredMenu) {
            case "outputGarageSpecialEventReceipt":
                return new OutputGarageSpecialEventReceipt(vehicleId,price);

            case "outputLostTicketReceipt":
                return new OutputLostTicketReceipt(vehicleId, price);
            default: return new InputMainMenu();
        }
    }

    //Regular Tickets
    public static Menu createMenu(int vehicleId, int hours, String timeFrame, double price) {
        return new OutputGarageReceipt(vehicleId, hours, timeFrame, price);
    }

    //End of Day Report
    public static Menu createMenu(double[] pricesToDisplayAndTotal) {
        return new OutputGarageClosedReport(pricesToDisplayAndTotal);
    }
}
