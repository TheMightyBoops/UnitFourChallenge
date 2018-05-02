package MenuCreator;

public class OutputGarageReceipt implements Menu {
    private int vehicleId = 0; //look for zero for errors
    private int hours = 0; // could also be an error, catch this in u test
    private String timeFrame = "error";
    private double price = 0.0;// zero = error

    OutputGarageReceipt(int vehicleId, int hours, String timeFrame, double price) {
        this.vehicleId = vehicleId;
        this.hours = hours;
        this.timeFrame = timeFrame;
        this.price = price;
    }
    /*//set all those fields
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setTimeFrame(String timeFrame) {
        this.timeFrame = timeFrame;
    }

    public void setPrice(double price) {
        this.price = price;
    }*/

    @Override
    public String getMenu() {
        return HEADER +
                "Receipt for vehicle id " + vehicleId + "\n" +
                hours + "hour(s) parked " + timeFrame + "\n" +
                "$" + String.format("%.2f", price);
    }
}
