public class Problem1323 {
      public int maximum69Number(int num) {
        int max = num;
        StringBuilder sb = new StringBuilder(num+"");
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == '9') {
                sb.setCharAt(i, '6');
                c = sb.charAt(i);
            } else if (c == '6') {
                sb.setCharAt(i, '9');
                c = sb.charAt(i);
            }
            int newNum = Integer.parseInt(sb.toString());

            if (newNum > max) {
                max = newNum;
                System.out.println("hello");
            }
            if (c == '9') {
                sb.setCharAt(i, '6');

            } else if (c == '6') {
                sb.setCharAt(i, '9');

            }

        }
        return max;
    }
}
