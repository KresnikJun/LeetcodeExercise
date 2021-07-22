package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidAnagramTest {

    @Test
    public void isAnagram() {
        ValidAnagram va = new ValidAnagram();
        Assert.assertEquals(va.isAnagram("anagram", "nagaram"), true);
        Assert.assertEquals(va.isAnagram("rat", "cat"), false);
    }
}