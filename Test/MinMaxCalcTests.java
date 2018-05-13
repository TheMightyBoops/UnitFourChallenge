import org.junit.Assert;
import org.junit.Test;
import FeeCalcs.MinMaxCalc.*;

public class MinMaxCalcTests {
    /*
     * There are tecnically other methods here not being tested in this package of
     * classes, but I don't see any practical test that needs to be done to them.
     */
    @Test
    public void MinMaxFeeCalculatorTests() {
        //Build object of calc for someone under 3 hours.
        MinMaxFeeCalculator overThreeTestCalc = new MinMaxFeeCalculator(1,12);
        //Build object of calc for someone over 3 hours.
        MinMaxFeeCalculator underThreeTestCalc = new MinMaxFeeCalculator(2,2);

        Assert.assertTrue("This class is not outputting the correct amounts.",
                overThreeTestCalc.getFee() > 5 ||
        underThreeTestCalc.getFee() == 5);

    }
}
