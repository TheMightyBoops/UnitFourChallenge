package FeeCalcs.SpEventCalc;
/**
 * This singleton class is instanced as soon as someone uses it once
 * as the special event is essential  a constant it should never be
 * instanced more than once, it just applies the special event fee
 * when it's needed.
 *
 * @version 1.0
 * @author Lucas Nolting
 */
public class SpEventInstance {
    private static double specialEventFee = 20;
    private static SpEventInstance spEventInstance = null;
    private static int id;


    /**
     * Private constructor for creating the first and only instance
     * of SpEventInstance.
     */
    private SpEventInstance() {

    }

    /**
     * Method for checking if an instance of SpEventInstance exists.
     * If it doesn't it creates one, else it returns the already
     * existing instance.
     * @param id unique ID for a vehicle entering the garage.
     * @return singleton instance of SpEventInstance.
     */
    public static SpEventInstance getSpEventInstance(int id) {
        if(spEventInstance == null) {
            spEventInstance = new SpEventInstance();
            SpEventInstance.id = id;
        }
        SpEventInstance.id = id;
        return spEventInstance;
    }


    /**
     * @return Fee associated with special event.
     */
    public double getSpecialEventFee() {
        return specialEventFee;
    }

    /**
     * @param id change unique ID associated w/ vehicle in garage.
     */
    public void setId(int id) {

    }


    /**
     * @param fee This method can be commented out if you want
     * the functionality to change the fee as an admin or something
     */
    //Uncomment to change the fee total for events
    //public void setSpecialEventFee(double fee) {
    //    this.specialEventFee = fee;
    //}
}
