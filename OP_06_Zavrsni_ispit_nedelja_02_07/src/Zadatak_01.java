import java.util.Scanner;

public class Zadatak_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int daysOfVacation=Integer.parseInt(sc.nextLine());
        double budgetForWholeGroup=Double.parseDouble(sc.nextLine());
        int numberOfPeople=Integer.parseInt(sc.nextLine());
        double priceForFuelPerKilometer=Double.parseDouble(sc.nextLine());
        double foodExpensesPerPersonForDay=Double.parseDouble(sc.nextLine());
        double hotelRoomPriceForOneNightPerPerson=Double.parseDouble(sc.nextLine());

        double totalPriceForFood=foodExpensesPerPersonForDay*daysOfVacation*numberOfPeople;
        double totalPriceForAccommodation=daysOfVacation*hotelRoomPriceForOneNightPerPerson*numberOfPeople;

        if(numberOfPeople>10){

            totalPriceForAccommodation*=0.75;
        }

        double totalPrice=totalPriceForFood+totalPriceForAccommodation;

        double expences=totalPrice;

        for(int i=1; i<=daysOfVacation; i++){

            double traveledDistanceInKilometerPerDay=Double.parseDouble(sc.nextLine());

            expences+=traveledDistanceInKilometerPerDay*priceForFuelPerKilometer;

            if(i%3==0 || i%5==0){

                double additionalExpences=expences*0.4;

                expences+=additionalExpences;

            }

            if(i%7==0){

                double smallAmountOfMoney=expences/numberOfPeople;
                expences-=smallAmountOfMoney;

            }

            if(expences>budgetForWholeGroup) {

                double difference=expences-budgetForWholeGroup;
                System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", difference);
                return;
            }



        }

            double difference=budgetForWholeGroup-expences;
            System.out.printf("You have reached the destination. You have %.2f$ budget left.", difference);


    }
}
