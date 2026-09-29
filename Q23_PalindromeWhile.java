import java.util.Scanner;

class Q23_PalindromeWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int original = n;
        int reverse = 0;
        int temp = n;

        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        if (reverse == original)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
