package FeeCalcs.LostTicketCalc;

public class LostTicketInstance {

    private static LostTicketInstance lostInst = null;
    private final double LOST_TICKET_FEE = 25.0;
    private int id;

    private LostTicketInstance() {
    }

    public static LostTicketInstance getLostTicketInstance(int id) {
        if(lostInst == null) {
            lostInst = new LostTicketInstance();
            lostInst.id = id;
        }

        lostInst.id = id;
        return lostInst;
    }

    public double getLostTicketFee() {
        return LOST_TICKET_FEE;
    }
}
