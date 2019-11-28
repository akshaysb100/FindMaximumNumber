import com.maximumnumber.com.FindMaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    @Test
    public void check_IntegerNumbers_FindMaximumNumber() {

        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        Assert.assertEquals(3,findMaximumNumber.checkIntegerMax());
    }

    @Test
    public void check_FloatNumbers_FindMaximumNumber() {

        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        Assert.assertEquals((Float) 3f,findMaximumNumber.checkFloatMax());
    }

    @Test
    public void checkGiven_String_FindMaximumNumber() {
        FindMaximumNumber findMaximumNumber = new FindMaximumNumber();
        Assert.assertEquals((String) "fsdg",findMaximumNumber.checkStringMax());
    }
}
