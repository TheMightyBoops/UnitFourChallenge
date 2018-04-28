package MenuCreator;

public class OutputGarageSpecialEventReceipt implements Menu {
    private int vehicleId = 0; //look for zero for errors
    private double price = 0.0;// zero = error

    OutputGarageSpecialEventReceipt(int vehicleId, double price) {
        this.vehicleId = vehicleId;
        this.price = price;
    }

    @Override
    public String getMenu() {
        return HEADER +
                "Receipt for a vehicle id " + vehicleId + "\n" +
                "\n" +
                "Special Event" +
                "$" + String.format("%.2f", price) + "\n";
    }
}
