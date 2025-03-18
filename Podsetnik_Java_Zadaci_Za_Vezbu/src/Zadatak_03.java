import java.util.Scanner;

public class Zadatak_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double inheritanceMoney=Double.parseDouble(sc.nextLine());
        double yearHeNeedsToLiveTo=Integer.parseInt(sc.nextLine());

        for(int i=1800; i<=yearHeNeedsToLiveTo; i++){

            if(i%2==0){

                inheritanceMoney-=12000;
            }

            else{

                inheritanceMoney=inheritanceMoney-(12000+50*(18+i-1800));

            }
        }

        if(inheritanceMoney>=0){

            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritanceMoney);
        }

        else{

            System.out.printf("He will need %.2f dollars to survive.", Math.abs(inheritanceMoney));
        }


    }
}
