package FeeCalcs.LostTicketCalc;
/**
 * The lost ticket class is a singleton that allows the creation of the one time
 * fee. It was designed as a singleton because data injected into the system via
 * this class should never change. It is created and it can be accessed, that is all.
 *
 * @version 1.0
 * @author Lucas Nolting
 */
public class LostTicketInstance {

    private static LostTicketInstance lostInst = null;
    private final double LOST_TICKET_FEE = 25.0;
    private int id;

    /**
     * Private constructor that is called by the get if the instance
     * does not yet exist.
     */
    private LostTicketInstance() {
    }

    /**
     * checks if an instance of the class exists, if it does not the class
     * gets created by the private const.
     * @param id allows the id of a vehicle to be changed on creation or
     * after the fact.
     *
     * @return get the singular instance of the object.
     */
    public static LostTicketInstance getLostTicketInstance(int id) {
        if(lostInst == null) {
            lostInst = new LostTicketInstance();
            lostInst.id = id;
        }

        lostInst.id = id;
        return lostInst;
    }

    /**
     * Simply get the constant that is a lost ticket.
     * @return the amount agreed upon if a user loses the ticket for
     * parking.
     */
    public double getLostTicketFee() {
        return LOST_TICKET_FEE;
    }
}
