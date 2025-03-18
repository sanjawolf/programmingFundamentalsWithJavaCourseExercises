import java.util.Scanner;

public class Zadatak_01_drugi_put {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int daysOfVacation=Integer.parseInt(sc.nextLine());

        double budgetForWholeGroup=Double.parseDouble(sc.nextLine());

        int numberOfPeople=Integer.parseInt(sc.nextLine());

        double priceForFuelPerKilometer=Double.parseDouble(sc.nextLine());

        double foodExpencesPerPersonForDay=Double.parseDouble(sc.nextLine());

        double hotelRoomPriceForOneNightPerPerson=Double.parseDouble(sc.nextLine());

        double totalPriceForFoodAndAccommodation=-1;

        if(numberOfPeople>10){

            totalPriceForFoodAndAccommodation=numberOfPeople*daysOfVacation*(foodExpencesPerPersonForDay+0.75*hotelRoomPriceForOneNightPerPerson);

        }

        else{

            totalPriceForFoodAndAccommodation=numberOfPeople*daysOfVacation*(foodExpencesPerPersonForDay+hotelRoomPriceForOneNightPerPerson);

        }

        double expences=totalPriceForFoodAndAccommodation;

        for(int i=1; i<=daysOfVacation; i++){

            double traveledDistanceInKilometersPerDay=Double.parseDouble(sc.nextLine());

            double fuelExpences=traveledDistanceInKilometersPerDay*priceForFuelPerKilometer;

            expences+=fuelExpences;

            if(i%3==0 || i%5==0){

                double additionalExpences=0.4*expences;

                expences+=additionalExpences;
            }

            if(i%7==0){

                expences-=expences/numberOfPeople;
            }

            if(expences>budgetForWholeGroup){

                double difference=expences-budgetForWholeGroup;

                System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", difference);
                return;
            }

        }

        if(expences<=budgetForWholeGroup){

            double difference=budgetForWholeGroup-expences;

            System.out.printf("You have reached the destination. You have %.2f$ budget left", difference);
        }




    }
}
