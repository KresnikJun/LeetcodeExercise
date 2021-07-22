package medium;

import org.junit.Assert;

public class ZigZagConversionTest {

    @org.junit.Test
    public void testConvert() {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        Assert.assertEquals(zigZagConversion.convert("PAYPALISHIRING", 4), "PINALSIGYAHRPI");
        Assert.assertEquals(zigZagConversion.convert("PAYPALISHIRING", 3), "PAHNAPLSIIGYIR");
        Assert.assertEquals(zigZagConversion.convert("A", 1), "A");
    }
}