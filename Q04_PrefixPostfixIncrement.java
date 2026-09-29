import java.util.Scanner;

class Q04_PrefixPostfixIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current visitors: ");
        int visitors = sc.nextInt();

        System.out.println("Visitor entering: " + (++visitors));
        System.out.println("Visitor leaving: " + (visitors--));
        System.out.println("Visitors remaining: " + visitors);
    }
}
