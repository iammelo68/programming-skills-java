import java.util.Scanner;

public class TwelfthExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double finalPrice = 0;

        System.out.println("Insert the product price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Insert payment method (cash or credit card): ");
        String paymentMethod = sc.nextLine();

        if(paymentMethod.equals("cash")) {
            finalPrice = price*0.85;
            //15% discount
        }

        else if(paymentMethod.equals("credit card")) {
            System.out.println("In how many months do you want to finance ?");
            int months = sc.nextInt();

            if (months==1) {
                finalPrice = price*0.9;
                //10% discount
            }
            else if (months==2) {
                finalPrice = price;
                //no discount
            }
            else if (months>2) {
                finalPrice = price+1.1;
                //10% additional mount of 10%
            }
        }

        System.out.println("The amount to pay is: "+finalPrice);

    }
}
