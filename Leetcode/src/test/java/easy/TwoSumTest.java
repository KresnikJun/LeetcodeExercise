package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    public void twoSum() {
        int[] ret = twoSum.twoSum(new int[]{2,7,11,15}, 9);
        int[] exp = new int[]{0,1};
        assertArrayEquals(ret, exp);
    }

    @Test
    public void anotherTwoSum() {
        int[] ret = twoSum.anotherTwoSum(new int[]{2,7,11,15}, 9);
        int[] exp = new int[]{0,1};
        assertArrayEquals(ret, exp);
    }
}