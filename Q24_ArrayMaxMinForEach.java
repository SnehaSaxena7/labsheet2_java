import java.util.Scanner;

class Q24_ArrayMaxMinForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int max = arr[0];
        int min = arr[0];

        for (int value : arr) {
            if (value > max) max = value;
            if (value < min) min = value;
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
