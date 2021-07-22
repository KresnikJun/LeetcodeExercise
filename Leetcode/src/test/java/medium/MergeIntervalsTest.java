package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeIntervalsTest {

    @Test
    public void merge() {
        MergeIntervals mi = new MergeIntervals();
        int[][] ret = mi.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        int[][] exp = new int[][]{{1,6},{8,10},{15,18}};
        assertArrayEquals(ret, exp);

        int[][] ret1 = mi.merge(new int[][]{{1,4},{2,3}});
        int[][] exp1 = new int[][]{{1,4}};
        assertArrayEquals(ret1, exp1);

        int[][] ret2 = mi.merge(new int[][]{{2,3},{4,5},{6,7},{8,9},{1,10}});
        int[][] exp2 = new int[][]{{1,10}};
        assertArrayEquals(ret2, exp2);
    }
}