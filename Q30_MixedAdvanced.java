import java.util.Scanner;

class Q30_MixedAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        boolean powerOf4 = n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
        System.out.println("Power of 4: " + powerOf4);

        int toggled = n ^ (1 << 2);
        System.out.println("After toggling 3rd bit: " + toggled);

        System.out.println("Multiplication table:");
        for (int i = 1; i <= 20; i++) {
            int value = n * i;

            if (value % 6 == 0)
                continue;

            if (value % 48 == 0)
                break;

            System.out.println(n + " x " + i + " = " + value);
        }
    }
}
