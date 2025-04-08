import java.util.Scanner;
//This algorithm calculates the user's BMI (body mass index).
public class NinthExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your weight: ");
        double weight = sc.nextDouble();
        System.out.println("Insert your height (cm)");
        double height = (sc.nextDouble()/100);

        double result = weight/(height*height);

        if (result>=40) {
            System.out.println("Obesity class III");
        }

        else if (result<40 && result>=35.0) {
            System.out.println("Obesity class II");
        }
        else if (result<35 && result>=30.0) {
            System.out.println("Obesity class I");
        }
        else if (result<30 && result>=25.0) {
            System.out.println("Overweight");
        }
        else if (result<25 && result>=18.6) {
            System.out.println("Normal");
        }
        else if (result<18.6) {
            System.out.println("Thinness");
        }
    }
}
