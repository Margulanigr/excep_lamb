import java.util.function.Predicate;

public class chck_prime_9 {
    public static void main(String[] args) {
        Predicate<Integer> is_Prime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        int n = 17;
        boolean isPrimeResult = is_Prime.test(n);
        System.out.println(n + " is prime? " + isPrimeResult);
        n = 15;
        isPrimeResult = is_Prime.test(n);
        System.out.println("\n"+n + " is prime? " + isPrimeResult);
    }
}
