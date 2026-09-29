import java.util.Scanner;

class Q08_ValidTriangleAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle 1: ");
        int a = sc.nextInt();
        System.out.print("Enter angle 2: ");
        int b = sc.nextInt();
        System.out.print("Enter angle 3: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 && a + b + c == 180)
            System.out.println("Valid triangle");
        else
            System.out.println("Invalid triangle");
    }
}
