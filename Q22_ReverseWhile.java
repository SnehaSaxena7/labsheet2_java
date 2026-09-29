import java.util.Scanner;

class Q22_ReverseWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int reverse = 0;
        int temp = Math.abs(n);

        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        if (n < 0)
            reverse = -reverse;

        System.out.println("Reverse = " + reverse);
    }
}
