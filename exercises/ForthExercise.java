import java.util.Scanner;

//This code takes an integer and prints the value and its successor and intercessor
public class ForthExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the value: ");
        int val = sc.nextInt();

        System.out.println("The successor of the value is: "+(val+1));
        System.out.println("The intercessor of the value is: "+(val-1));
        sc.close();
    }
}
