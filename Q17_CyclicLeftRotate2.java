import java.util.Scanner;

class Q17_CyclicLeftRotate2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int rotated = (n << 2) | (n >>> 30);

        System.out.println("After cyclic left rotation by 2 = " + rotated);
    }
}
