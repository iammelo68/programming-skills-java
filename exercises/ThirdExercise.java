/*
* This code reads 2 values (A and B) and if they're equal it sums the values, either way, it multiplies.
* Then, it assigns to a variable C and prints it. It only takes integers.
* */

import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the value A: ");
        int a = sc.nextInt();
        System.out.println("Insert the value B: ");
        int b = sc.nextInt();
        int c;
        if(a==b){
            c = a+b;
        }
        else {
            c = a*b;
        }
        System.out.println(c);
        sc.close();
    }
}
