import java.util.Scanner;

public class Zadatak_01_02_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite tri cene: ");

        int price1=Integer.parseInt(sc.nextLine());

        int price2=Integer.parseInt(sc.nextLine());

        int price3=Integer.parseInt(sc.nextLine());

        if(price1<=0 || price2<=0 || price3<=0) System.out.println("Greska: neispravan unos cene.");

        else{

            int totalPrice=price1+price2+price3;

            if(price1<price2){

                if(price1<price3) price1=1;

                else price3=1;
            }

            else{

                if(price2<price3) price2=1;

                else price3=1;
            }

            int discountPrice=price1+price2+price3;

            System.out.printf("Cena sa popustom: %d\n", discountPrice);

            int saving=totalPrice-discountPrice;

            System.out.printf("Usteda: %d", saving);

        }





    }
}
