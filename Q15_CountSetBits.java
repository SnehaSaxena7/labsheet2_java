import java.util.Scanner;

class Q15_CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int count = 0;
        int value = n;

        while (value != 0) {
            count += value & 1;
            value >>>= 1;
        }

        System.out.println("Number of set bits = " + count);
    }
}
