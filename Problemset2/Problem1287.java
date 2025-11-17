class Problem1287 {

    public int findSpecialInteger(int[] arr) {
        int freq = 1;
        int count = 1;
        int ans = arr[0];
        int currentElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (currentElement == arr[i]) {
                freq++;
            } else {
                if (count < freq) {
                    count = freq;
                    ans = arr[i - 1];
                }
                currentElement = arr[i];
                freq = 1;
            }
        }
        if (count < freq) {
            ans = currentElement;
        }
        return ans;
    }
}
