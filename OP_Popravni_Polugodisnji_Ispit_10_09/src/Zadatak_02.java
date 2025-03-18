import java.util.Scanner;

public class Zadatak_02 {

    public static double calculate(int kilometersTraveled, int taxIncrease, int increasingKilometers, int taxDecline, int yearsTaxShouldPaid, int initialTax){

        int taxIncreaseTotal=taxIncrease*(kilometersTraveled/increasingKilometers);
        double taxDeclineTotal=taxDecline*yearsTaxShouldPaid;

        return (taxIncreaseTotal + (initialTax-taxDeclineTotal));
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(">>");

        String [] cars=new String[parts.length];

        for(int i=0; i< parts.length; i++){

            cars[i]=parts[i];
        }

        double totalTax=-1;

        double totalTaxCollected=0;

        for(int i=0; i<cars.length; i++){

            String [] carsParts=cars[i].split(" ");

            int yearsTaxShouldPaid=Integer.parseInt(carsParts[1]);
            int kilometersTraveled=Integer.parseInt(carsParts[2]);

            if(carsParts[0].equals("family")){

                totalTax=calculate(kilometersTraveled, 12, 3000, 5, yearsTaxShouldPaid, 50);
                totalTaxCollected+=totalTax;
                System.out.printf("A %s car will pay %.2f euros in taxes.\n", carsParts[0], totalTax);
            }

            else if(carsParts[0].equals("heavyDuty")){

                totalTax=calculate(kilometersTraveled, 14, 9000, 8, yearsTaxShouldPaid, 80);
                totalTaxCollected+=totalTax;
                System.out.printf("A %s car will pay %.2f euros in taxes.\n", carsParts[0], totalTax);
            }



            else if(carsParts[0].equals("sports")){

                totalTax=calculate(kilometersTraveled, 18, 2000, 9, yearsTaxShouldPaid, 100);
                totalTaxCollected+=totalTax;
                System.out.printf("A %s car will pay %.2f euros in taxes.\n", carsParts[0], totalTax);
            }


            else{

                System.out.println("Invalid car type.");
            }



        }

        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.", totalTaxCollected);
    }
}
