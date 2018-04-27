import FeeCalcs.LostTicketCalc.LostTicketInstance;
import org.junit.Assert;
import org.junit.Test;

public class LostTicketInstanceTests {
    LostTicketInstance testTicket = LostTicketInstance.getLostTicketInstance();

    @Test
    public void testLostTicketFee() {
        Assert.assertTrue("The lost tic. fee either doesn't exist, " +
                "or is null",LostTicketInstance.getLostTicketInstance() != null
                && testTicket.getLostTicketFee() == 25.0);
    }
 }
