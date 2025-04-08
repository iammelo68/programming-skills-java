import java.util.Scanner;

public class EleventhExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double result = 0;
        for (int i=1; i<5; i++) {
            System.out.println("Insert your grade: (semester "+i+")");
            result += sc.nextDouble();
            count++;
        }

        System.out.println("Your average grade is: "+result/count);
        sc.close();
    }
}
