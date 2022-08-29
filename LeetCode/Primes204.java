package rememberStringPrograms.LeetCode;

public class Primes204 {

    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (isPrime(i))
                count++;
        }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        int a = countPrimes(n);
        System.out.println(a);
    }
}
