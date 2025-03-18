import java.util.Scanner;

public class Zadatak_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double budget=Double.parseDouble(sc.nextLine());
        String category=sc.nextLine();
        int numberOfPeopleInGroup=Integer.parseInt(sc.nextLine());

        double transport=-1;

        if(numberOfPeopleInGroup>=1 && numberOfPeopleInGroup<=4){

            transport=0.75*budget;
        }

        else if(numberOfPeopleInGroup>=5 && numberOfPeopleInGroup<=9){

            transport=0.6*budget;
        }

        else if(numberOfPeopleInGroup>=10 && numberOfPeopleInGroup<=24){

            transport=0.5*budget;
        }

        else if(numberOfPeopleInGroup>=25 && numberOfPeopleInGroup<=49){

            transport=0.4*budget;
        }

        else{

            transport=0.25*budget;
        }

        budget-=transport;

        switch(category){

            case "VIP":

                if(budget>=499.99*numberOfPeopleInGroup){

                    double difference=budget-499.99*numberOfPeopleInGroup;
                    System.out.printf("Yes! You have %.2f leva left.", difference);

                }

                else{

                    double difference=499.99*numberOfPeopleInGroup-budget;
                    System.out.printf("Not enough money! You need %.2f leva.", difference);

                }

                break;

            case "Normal":

                if(budget>=249.99*numberOfPeopleInGroup){

                    double difference=budget-249.99*numberOfPeopleInGroup;
                    System.out.printf("Yes! You have %.2f leva left.", difference);

                }

                else{

                    double difference=249.99*numberOfPeopleInGroup-budget;
                    System.out.printf("Not enough money! You need %.2f leva.", difference);

                }

                break;

            default:

        }
    }
}
