import com.maximumnumber.com.FindMaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    @Test
    public void check_IntegerNumbers_FindMaximumNumber() {

        FindMaximumNumber findMaximumNumber = new FindMaximumNumber(1,4,3);
        Assert.assertEquals((Integer) 4, findMaximumNumber.toMaximumNumber());
    }

    @Test
    public void check_FloatNumbers_FindMaximumNumber() {

        FindMaximumNumber findMaximumNumber = new FindMaximumNumber(6.1f, 6.2f, 6.5f);
        Assert.assertEquals((Float) 6.5f, findMaximumNumber.toMaximumNumber());
    }

    @Test
    public void checkGiven_String_FindMaximumNumber() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber("ak", "sk", "pk");
        Assert.assertEquals((String) "sk", findMaximumNumber.toMaximumNumber());
    }
}
