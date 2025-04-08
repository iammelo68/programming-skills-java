import java.util.Scanner;

public class TenthExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the first grade: ");
        double gradeOne = sc.nextDouble();
        System.out.println("Insert the second grade: ");
        double gradeTwo = sc.nextDouble();
        System.out.println("Insert the third grade: ");
        double gradeThree = sc.nextDouble();

        double result = (gradeOne+gradeTwo+gradeThree)/3;

        System.out.println("Your average grade is: "+result);
        sc.close();
    }
}
