class Problem1652{
      public int[] decrypt(int[] code, int k) {
              int n = code.length;
              int[] res = new int[n];
              for (int i = 0; i < n; i++) {
                  if (k == 0) {
                      res[i] = 0;
                  } else if (k > 0) {
                      int sum = 0;
                      int j = 0;
                      int m = i + 1;
                      while (j < k) {
                          if (m == n) {
                              m = 0;
                          }
                          j++;
                          sum += code[m];
                          m++;

                      }
                      res[i] = sum;
                  } else if (k < 0) {
                      int sum = 0;
                      int j = 0;
                      int m = i - 1;
                      int l = Math.abs(k);
                      while (j < l) {
                          if (m < 0) {
                              m = n - 1;
                          }
                          System.out.println("m :" + m);
                          sum += code[m];
                          j++;
                          m--;

                      }
                      res[i] = sum;
                  }
              }
              return res;
          }
}