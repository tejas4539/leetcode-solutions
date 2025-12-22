import java.util.Arrays;

public class Problem1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int maxUnit = 0;
        int size = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            int j = 1;

            if (size < truckSize) {
                int value = truckSize - size;
                if (boxTypes[i][0] < value) {
                    value = boxTypes[i][0];
                }
                maxUnit += value * boxTypes[i][j];
                size += value;
            } else {
                break;
            }

        }

        return maxUnit;
    }
}
