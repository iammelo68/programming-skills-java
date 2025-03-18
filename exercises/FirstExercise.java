import java.util.Scanner;

//This code reads 3 values (A, B and C), outputs the sum of A and B and if its minor than C
public class FirstExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //It only takes integers
        System.out.println("Insert the value of A: ");
        int a = scan.nextInt();
        System.out.println("Insert the value of B: ");
        int b = scan.nextInt();
        System.out.println("Insert the value of C: ");
        int c = scan.nextInt();

        System.out.println("The sum of A and B is: " + (a + b));

        if(a+b<c){
            System.out.println("The sum of A and B is minor than C");
        }
        scan.close();
    }
}
