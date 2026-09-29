import java.util.Scanner;

class Q11_StudentPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter theory percentage: ");
        double theory = sc.nextDouble();
        System.out.print("Enter practical percentage: ");
        double practical = sc.nextDouble();
        System.out.print("Enter overall percentage: ");
        double overall = sc.nextDouble();

        if ((theory >= 40 && practical >= 50) || overall >= 50)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
