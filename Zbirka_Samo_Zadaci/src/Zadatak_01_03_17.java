import java.util.Scanner;

public class Zadatak_01_03_17 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite cene: ");

        String text=sc.nextLine();

        String [] prices=text.split(" ");

        if(prices.length==1){

            System.out.println("Nisu unete cene.");
            return;
        }

        double sum=0;

        for(int i=0; i<= prices.length-1; i++){

            double price=Double.parseDouble(prices[i]);

            if(price==0) break;

            if(price<0){

                System.out.println("Greska: neispravan unos cene.");
                return;

            }

            sum+=price;
        }

        double am=sum/(prices.length-1);
        System.out.printf("Prosecna cena: %.4f", am);
    }
}
