import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Zadatak_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int daysOfChampionship=Integer.parseInt(sc.nextLine());
        int pointsNeedToBeCovered=Integer.parseInt(sc.nextLine());
        int countOfSwimmers=Integer.parseInt(sc.nextLine());
        double hotelRoomPriceForDayForOneSwimmer=Double.parseDouble(sc.nextLine());
        double participationFeePerSwimmer=Double.parseDouble(sc.nextLine());

        double money=countOfSwimmers*(participationFeePerSwimmer+daysOfChampionship*hotelRoomPriceForDayForOneSwimmer);

        double points=0;

        for(int i=1; i<=daysOfChampionship; i++){

            double pointsEarnedForEachOfDays=Double.parseDouble(sc.nextLine());

            points+=pointsEarnedForEachOfDays;

            if(i!=1){

                points+=0.05*pointsEarnedForEachOfDays;
            }


        }

        if(points>=pointsNeedToBeCovered){

            double moneyLeftToPay=0.75*money;
            System.out.printf("Money left to pay: %.2f USD.\n", moneyLeftToPay);
            System.out.println("The championship was successful!");
        }

        else{

            double moneyLeftToPay=0.9*money;
            System.out.printf("Money left to pay: %.2f USD.\n", moneyLeftToPay);
            System.out.println("The championship was not successful.");
        }

    }
}
