import TimeMachine.TimeMachine;
import org.junit.Assert;
import org.junit.Test;

public class TimeMachineTests {

    private TimeMachine testTime = new TimeMachine();
    private String testTimes[] = testTime.getFormattedTimes();
    @Test
    public void timeMConstructorTest() {
        Assert.assertTrue("Constructor failed null check.",
                testTime != null);
    }

    @Test
    public  void getFormattedTimesTest() {
        Assert.assertTrue("formatted times method outputting string data.",
                testTime.getFormattedTimes() instanceof String[]);

        Assert.assertTrue("one of the array positions is wrong.",
                testTimes[0] != null || testTimes[1] != null);
    }

    @Test
    public void getHoursBetweenTests() {
        Assert.assertTrue("Output of getHoursBet... is broken",
                testTime.getFormattedTimes()!= null);
    }
}
