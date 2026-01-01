package Problemset4;

public class Problem2231 {
    public int largestInteger(int num) {
        List<Integer> li1 = new ArrayList<>();
        List<Integer> li2 = new ArrayList<>();
        List<String> li = new ArrayList<>();
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - '0';
            if (a % 2 == 0) {
                li.add("even");
                li1.add(a);
            } else {
                li.add("odd");
                li2.add(a);
            }
        }

        Collections.sort(li1);
        Collections.sort(li2);

        int m = li1.size() - 1;
        int n = li2.size() - 1;
        int res = 0;
        for (int i = 0; i < li.size(); i++) {
            if (li.get(i) == "even") {
                res = res * 10 + li1.get(m);
                m--;
            } else {
                res = res * 10 + li2.get(n);
                n--;
            }
        }
        return res;
    }

}