package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void isValid() {
        ValidParentheses vp = new ValidParentheses();
        Assert.assertEquals(vp.isValid("(("), false);
        Assert.assertEquals(vp.isValid("([)]"), false);
        Assert.assertEquals(vp.isValid("]}"), false);
        Assert.assertEquals(vp.isValid("]"), false);
        Assert.assertEquals(vp.isValid(""), true);
    }
}