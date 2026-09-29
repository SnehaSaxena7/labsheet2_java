import java.util.Scanner;

class Q21_FactorsDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        int i = 1;
        System.out.print("Factors: ");

        do {
            if (n % i == 0)
                System.out.print(i + " ");
            i++;
        } while (i <= n);
    }
}
