import com.maximumnumber.com.FindMaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    @Test
    public void check_IntegerNumbers_FindMaximumNumber() {

        FindMaximumNumber findMaximumNumber = new FindMaximumNumber<Integer>(1,4,3,2,6,2,3);
        Assert.assertEquals((Integer) 6, findMaximumNumber.check());
    }

    @Test
    public void check_FloatNumbers_FindMaximumNumber() {

        FindMaximumNumber findMaximumNumber = new FindMaximumNumber<Float>(6.1f, 6.2f, 6.5f,6.2f);
        Assert.assertEquals((Float) 6.5f, findMaximumNumber.check());
    }

    @Test
    public void checkGiven_String_FindMaximumNumber() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber<String>("ak", "sk", "pk","ds","1","as");
        Assert.assertEquals((String) "sk", findMaximumNumber.check());
    }

}
