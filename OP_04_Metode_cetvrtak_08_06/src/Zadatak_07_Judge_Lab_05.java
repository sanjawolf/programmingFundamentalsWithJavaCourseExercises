
import java.util.Scanner;

public class Zadatak_07_Judge_Lab_05 {

    public static double countTheTotalPrice(String product, int quantity){

        double price=-1;

        switch(product){

            case "coffee":
                price=1.50*quantity;
                break;

            case "water":
                price=1.00*quantity;
                break;

            case "coke":
                price=1.40*quantity;
                break;

            case "snacks":
                price=2.00*quantity;
                break;

            default:
        }

        return price;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String product=sc.nextLine();

        int quantity=Integer.parseInt(sc.nextLine());

        double totalPrice=countTheTotalPrice(product, quantity);

        System.out.printf("%.2f", totalPrice);
    }
}
