package FeeCalcs.SpEventCalc;

public class SpEventInstance {
    private double specialEventFee = 20;
    private static SpEventInstance spEventInstance = null;

    private SpEventInstance() {

    }

    public static SpEventInstance getSpEventInstance() {
        if(spEventInstance == null) {
            spEventInstance = new SpEventInstance();
        }
        return spEventInstance;
    }

    public double getSpecialEventFee() {
        return specialEventFee;
    }

    //Uncomment to change the fee total for events
    //public void setSpecialEventFee(double fee) {
    //    this.specialEventFee = fee;
    //}
}
