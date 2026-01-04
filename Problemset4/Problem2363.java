package Problemset4;

import java.util.ArrayList;
import java.util.List;

public class Problem2363 {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> li = new ArrayList<>();
        int[] i1 = new int[1001];
        int[] i2 = new int[1001];

        for (int i = 0; i < items1.length; i++) {
            i1[items1[i][0]] = items1[i][1];
        }
        for (int i = 0; i < items2.length; i++) {
            i2[items2[i][0]] = items2[i][1];
        }

        for (int i = 0; i < 1001; i++) {
            List<Integer> li2 = new ArrayList<>();
            if (i1[i] != 0 && i2[i] != 0) {
                li2.add(i);
                li2.add(i1[i] + i2[i]);
            } else if (i1[i] != 0 && i2[i] == 0) {
                li2.add(i);
                li2.add(i1[i]);
            } else if (i1[i] == 0 && i2[i] != 0) {
                li2.add(i);
                li2.add(i2[i]);
            }
            if (li2.size() > 1)
                li.add(li2);

        }
        return li;
    }
}
