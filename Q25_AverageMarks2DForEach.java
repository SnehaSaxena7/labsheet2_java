import java.util.Scanner;

class Q25_AverageMarks2DForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int[][] marks = new int[students][subjects];
        int total = 0;
        int count = 0;

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter marks for student " + (i + 1) + ", subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        for (int[] student : marks) {
            for (int mark : student) {
                total += mark;
                count++;
            }
        }

        System.out.println("Average marks = " + ((double) total / count));
    }
}
