package TASKS;

public class PrimeNumber {
    public static boolean isPrime(int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true; // Base case: 2 and 3 are prime
        }
        if (n % divisor == 0) {
            return false; // n is divisible by divisor, so it's not prime
        }
        if (divisor * divisor > n) {
            return true; // Base case: n is not divisible by any number up to its square root
        }
        return isPrime(n, divisor + 1); // Recursive call with the next divisor
    }

    public static void main(String[] args) {
        int number = 17;
        if (isPrime(number, 2)) { // Start checking divisors from 2
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}