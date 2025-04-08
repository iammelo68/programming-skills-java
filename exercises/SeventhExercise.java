/*This algorithm takes two boolean values and checks whether they both are
TRUE or FALSE or different from each other
*/
import java.util.Scanner;

public class SeventhExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean booleanOne;
        boolean booleanTwo;

        System.out.println("Insert a boolean value (true or false): ");
        booleanOne = sc.nextBoolean();

        System.out.println("Insert one more boolean value: ");
        booleanTwo = sc.nextBoolean();

        if (booleanOne) {
            if (booleanTwo) {
                System.out.println("Both values are true");
            }
        }

        else if (!booleanOne) {
            if (!booleanTwo) {
                System.out.println("Both values are false");
            }
        }
        else {
            System.out.println("The values are different");
        }

        sc.close();
    }
}
