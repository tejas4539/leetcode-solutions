public class Problem1103 {
     public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int j = 1;
        int i = 0;
        while (candies > 0) {

            if (candies >= j) {
                System.out.println(i);
                res[i] += j;
                candies -= j;
                j++;
            } else {
                System.out.println(res[i]);
                res[i] = res[i] + candies;
                candies = 0;
            }
            if (i < res.length - 1) {
                i++;
            } else {
                i = 0;
            }
        }

        return res;

    }
}
