package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/merge-intervals/
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0) {
            return new int[0][2];
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<int[]> ret = new ArrayList<int[]>();
        for(int i = 0; i < intervals.length; i++) {
            if(ret == null || ret.isEmpty()) {
                ret.add(intervals[i]);
            } else {
                int lastR = ret.get(ret.size() - 1)[1];
                if(lastR < intervals[i][0]) {
                    ret.add(intervals[i]);
                } else {
                    ret.get(ret.size() - 1)[1] = Math.max(intervals[i][1], lastR);
                }
            }
        }

        return ret.toArray(new int[ret.size()][]);
    }
}
