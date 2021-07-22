package medium;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void lengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        Assert.assertEquals(l.lengthOfLongestSubstring("abcabcbb"), 3);
        Assert.assertEquals(l.lengthOfLongestSubstring("abcabcbb"), 3);
        Assert.assertEquals(l.lengthOfLongestSubstring("abcabcbb"), 3);
    }
}