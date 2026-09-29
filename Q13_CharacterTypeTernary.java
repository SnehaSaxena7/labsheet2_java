import java.util.Scanner;

class Q13_CharacterTypeTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String type = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                       ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                       ? "Vowel"
                       : ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
                         ? "Consonant"
                         : (ch >= '0' && ch <= '9')
                           ? "Digit"
                           : "Special symbol";

        System.out.println(type);
    }
}
