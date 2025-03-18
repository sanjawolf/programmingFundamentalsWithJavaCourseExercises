import java.util.Scanner;

public class Zadatak_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double journeyWillCost = Double.parseDouble(sc.nextLine());
        int numberOfMonthsForWhichYouHaveToCollectMoney = Integer.parseInt(sc.nextLine());

        double savings=0;

        for (int i = 1; i <= numberOfMonthsForWhichYouHaveToCollectMoney; i++) {

            if (i % 2 != 0 && i != 1) {

                savings *= 0.84;
            }

            if (i % 4 == 0) {

                savings *= 1.25;
            }

            savings += 0.25 * journeyWillCost;
        }

        if(savings>=journeyWillCost){

            double difference=savings-journeyWillCost;

            System.out.printf("Bravo! You can go to Disneyland and you will have %.2f USD for souvenirs.", difference);


        }

        else{

            double difference=journeyWillCost-savings;
            System.out.printf("Sorry. You need %.2f USD more.", difference);
        }
    }
}
