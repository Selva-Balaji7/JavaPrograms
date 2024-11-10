import java.util.Scanner;

class dummy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();

        if (a <= 1) {
            System.out.println("Not a prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;  // Exit the loop if a factor is found
                }
            }
            System.out.println(isPrime ? "Prime number" : "Not a prime number");
        }

        
    }
}
