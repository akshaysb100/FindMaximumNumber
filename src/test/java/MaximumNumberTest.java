import com.maximumnumber.com.FindMaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    @Test
    public void name() {

        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        Assert.assertEquals(3,findMaximumNumber.checkIntegerMax());
    }
}
