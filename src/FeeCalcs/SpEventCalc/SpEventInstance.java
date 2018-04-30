package FeeCalcs.SpEventCalc;

public class SpEventInstance {
    private static double specialEventFee = 20;
    private static SpEventInstance spEventInstance = null;
    private static int id;

    private SpEventInstance() {

    }

    public static SpEventInstance getSpEventInstance(int id) {
        if(spEventInstance == null) {
            spEventInstance = new SpEventInstance();
            SpEventInstance.id = id;
        }
        SpEventInstance.id = id;
        return spEventInstance;
    }

    public double getSpecialEventFee() {
        return specialEventFee;
    }

    public void setId(int id) {

    }

    //Uncomment to change the fee total for events
    //public void setSpecialEventFee(double fee) {
    //    this.specialEventFee = fee;
    //}
}
