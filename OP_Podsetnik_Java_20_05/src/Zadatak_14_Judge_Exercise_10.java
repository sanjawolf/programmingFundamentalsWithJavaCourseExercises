import java.util.Scanner;

public class Zadatak_14_Judge_Exercise_10 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double amountOfMoneyGeorgeLucasHas=Double.parseDouble(sc.nextLine());
        int countOfStudents=Integer.parseInt(sc.nextLine());
        double priceOfLightsabers=Double.parseDouble(sc.nextLine());
        double priceOfRobes=Double.parseDouble(sc.nextLine());
        double priceOfBelts=Double.parseDouble(sc.nextLine());

        double price=countOfStudents*priceOfRobes+Math.ceil(1.1*countOfStudents)*priceOfLightsabers+(countOfStudents-countOfStudents/6)*priceOfBelts;


        if(price<=amountOfMoneyGeorgeLucasHas){

            System.out.printf("The money is enough - it would cost %.2f USD.", price);
        }

        else{

            double difference=price-amountOfMoneyGeorgeLucasHas;
            System.out.printf("George Lucas will need %.2f USD more.", difference);
        }



    }
}
