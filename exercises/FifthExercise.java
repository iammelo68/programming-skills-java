//This algorithm reads an inserted salary and compares to the minimum salary in Brazil (R$1518)

import java.text.DecimalFormat;
import java.util.Scanner;

public class FifthExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your salary:");
        float sal = sc.nextFloat();
        float minSal = 1518;
        float qntSal = sal/minSal;

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Your salary is equal to: "+df.format(qntSal)+" minimum salaries in Brazil");
        sc.close();
    }
}
