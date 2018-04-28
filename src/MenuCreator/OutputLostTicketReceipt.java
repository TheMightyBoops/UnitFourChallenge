package MenuCreator;

public class OutputLostTicketReceipt implements Menu {

    private int vehicleId = 0; //look for zero for errors
    private double price = 0.0;// zero = error

    public OutputLostTicketReceipt(int vehicleId, double price) {
        this.vehicleId = vehicleId;
        this.price = price;
    }

    //Set the fields
    /*public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setPrice(double price) {
        this.price = price;
    }*/

    @Override
    public String getMenu() {
        return HEADER +
                "Receipt for a vehicle id " + vehicleId + "\n" +
                " \n" +
                "Lost Ticket\n" +
                "$" + String.format("%.2f", price) + "\n";
    }
}
