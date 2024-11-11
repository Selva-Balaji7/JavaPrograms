
import java.util.Scanner;

class AmstrongRang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting value:");
        int start = sc.nextInt();
        System.out.println("Enter the ending value:");
        int end = sc.nextInt();
        amstrong(start, end);

    }

    public static void amstrong(int start, int end) {

        for (int i = start; i <= end; i++) {
            int original_value = i;
            int res = 0;
            int temp = i;
            int len = String.valueOf(i).length();
            while (temp != 0) {
                int rem = temp % 10;
                res += power(rem, len);
                temp = temp / 10;
            }
            if (res == original_value) {
                System.out.println("Amstrong number");
            } else {
                System.out.println("Not an Amstrong number");
            }
        }
    }

    public static int power(int rem, int len) {
        int res = 1;
        for (int i = 1; i <= len; i++) {
            res *= rem;
        }
        return res;
    }

}
