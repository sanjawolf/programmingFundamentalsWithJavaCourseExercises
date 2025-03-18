import java.util.Scanner;

public class Zadatak_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double budget=Double.parseDouble(sc.nextLine());
        int numberOfStudents=Integer.parseInt(sc.nextLine());
        double priceForFlourPackage=Double.parseDouble(sc.nextLine());
        double priceForSingleEgg=Double.parseDouble(sc.nextLine());
        double priceForSingleApron=Double.parseDouble(sc.nextLine());

        double expences=0;

        for(int i=1; i<=numberOfStudents; i++){

            double flourPackage=-1;

            if(i%5==0){

                flourPackage=0;

            }

            else{

                flourPackage=priceForFlourPackage;
            }

            double educationalSetPrice=flourPackage+10*priceForSingleEgg+priceForSingleApron;
            expences+=educationalSetPrice;
        }

        expences+=Math.ceil(0.2*numberOfStudents)*priceForSingleApron;

        if(expences<=budget){

            System.out.printf("Items purchased for %.2f$.", expences);
        }

        else{

            System.out.printf("%.2f$ more needed.", expences-budget);
        }

    }
}
