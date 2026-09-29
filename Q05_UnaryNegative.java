import java.util.Scanner;

class Q05_UnaryNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int negative = -n;
        System.out.println("Negative value = " + negative);
    }
}
