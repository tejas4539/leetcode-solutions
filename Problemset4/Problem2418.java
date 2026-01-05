package Problemset4;

public class Problem2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length - 1; i++) {
            int tallest = heights[i];
            int idx = i;
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[j] > tallest) {
                    tallest = heights[j];
                    idx = j;
                }

            }
            String temp1 = names[i];
            names[i] = names[idx];
            names[idx] = temp1;
            int temp = heights[i];
            heights[i] = tallest;
            heights[idx] = temp;
        }
        return names;
    }
}
