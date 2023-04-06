import org.junit.Assert;
import org.junit.Test;

public class CheckerTest {

    @Test

    public void enterEvenNumber() {
        Assert.assertTrue("Enter an Integer number:", EvenOddChecker.check(2));
    }

    @Test
    public void enterOddNumber() {
        Assert.assertFalse("Entered number is odd", EvenOddChecker.check(3));
    }

    @Test
    public void enterZeroNumber() {
        Assert.assertTrue("Enter an Integer number:", EvenOddChecker.check(0));
    }

    @Test
    public void enterNegativeNumber() {
        Assert.assertFalse("Entered number is odd", EvenOddChecker.check(-1));
    }

}
