package FeeCalcs.LostTicketCalc;

public class LostTicketInstance {

    private static LostTicketInstance lostInst = null;
    private final double LOST_TICKET_FEE = 25.0;

    private LostTicketInstance() {
    }

    public static LostTicketInstance getLostTicketInstance() {
        if(lostInst == null) {
            lostInst = new LostTicketInstance();
        }
        return lostInst;
    }

    public double getLostTicketFee() {
        return LOST_TICKET_FEE;
    }
}
