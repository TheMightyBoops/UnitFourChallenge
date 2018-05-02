import FeeCalcs.SpEventCalc.SpEventInstance;
import org.junit.Assert;
import org.junit.Test;

public class SpEventTests {

    SpEventInstance testInstance = SpEventInstance.getSpEventInstance(1);

    @Test
    public void SpEventFactoryTest() {
        Assert.assertTrue("The lost tic. fee either doesn't exist, " +
                "or is null",testInstance.getClass() != null
                && testInstance.getSpecialEventFee() == 20.0);
    }
}
