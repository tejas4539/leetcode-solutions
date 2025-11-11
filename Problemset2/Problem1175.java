package Problemset2;

public class Problem1175 {
     static final int MOD = 1_000_000_007;

    public static int countPrime(int n){
        int count=0;
        if(n==1) return 0;
        if(n>=2) count++;
        for(int i=3;i<=n;i++){
            boolean prime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                   prime=false;
                   break;
                }
            }
            if(prime) count++;
        }
        return count;
    }
    public static long factorial(int n){
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = (fact * i) % MOD; // take modulo at each step
        }
        return fact;
    }
    public int numPrimeArrangements(int n) {
        int prime=countPrime(n);
        int notPrime=n-prime;

        long ans = (factorial(prime) * factorial(notPrime)) % MOD;
        return (int) ans;
      
       

    }
}
