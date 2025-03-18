import java.util.Scanner;
//This algorithm reads 3 integers and put it in descending order

public class EighthExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[3];
        System.out.println("Insert the A value: ");
        int a = sc.nextInt();
        System.out.println("Insert the B value: ");
        int b = sc.nextInt();
        System.out.println("Insert the C value: ");
        int c = sc.nextInt();

        if (a>b && a>c) {
            result[0] = a;
            if (b>=c) {
                result[1] = b;
                result[2] = c;
            }
            else {
                result[1] = c;
                result[2] = b;
            }
        }
        else if (b>=a && b>=c) {
            result[0] = b;
            if(a>=c) {
                result [1] = a;
                result [2] = c;
            }
            else {
                result[2] = a;
                result[1] = c;
            }
        }

        else {
            result[0] = c;
            if(b>=a){
                result[1] = b;
                result [2] = a;
            }
            else {
                result[1] = a;
                result[2] = b;
            }

        }
        for (int num:result) {
            System.out.println(num);
        }
    }
}
