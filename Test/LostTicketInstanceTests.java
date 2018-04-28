import FeeCalcs.LostTicketCalc.LostTicketInstance;
import org.junit.Assert;
import org.junit.Test;

public class LostTicketInstanceTests {
    LostTicketInstance testTicket = LostTicketInstance.getLostTicketInstance(1);

    @Test
    public void testLostTicketFee() {
        Assert.assertTrue("The lost tic. fee either doesn't exist, " +
                "or is null",LostTicketInstance.getLostTicketInstance(1) != null
                && testTicket.getLostTicketFee() == 25.0);
    }
 }
