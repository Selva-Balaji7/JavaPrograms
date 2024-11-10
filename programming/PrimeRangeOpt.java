import java.util.Scanner;

class PrimeRangeOpt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting range:");
        int start = sc.nextInt();
        System.out.println("Enter the ending range:");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println("Prime number: " + i);
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // Numbers less than or equal to 1 are not prime
        if (num == 2) return true;  // 2 is the only even prime number
        if (num % 2 == 0) return false; // Skip even numbers greater than 2

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false; // If divisible by any number, it's not prime
        }
        return true; // Prime if no divisors were found
    }
}
