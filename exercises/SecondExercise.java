import java.util.Scanner;

//This code reads a number and checks whether it's positive or not and if it's divisible by 2
public class SecondExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //It only takes integers
        System.out.println("Insert a value: ");
        int val = scan.nextInt();

        if(val>0){
          System.out.println("The value inserted is positive");
        }
        else if(val==0) {
            System.out.println("The value inserted is neutral");
        }
        else {
            System.out.println("The value inserted is negative");
        }

        if(val%2==0) {
            System.out.println("The value inserted is divisible by 2");
        }
        else{
            System.out.println("The value inserted is not divisible by 2");
        }
        scan.close();
    }
}
