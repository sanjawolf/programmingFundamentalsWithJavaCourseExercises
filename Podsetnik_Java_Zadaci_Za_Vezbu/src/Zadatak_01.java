import java.util.Scanner;

public class Zadatak_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        String periodOfDay=sc.nextLine();

        double TAXI_STARTING_FEE=0.70;
        double BUS=0.09;
        double TRAIN=0.06;
        double price=-1;
        double TAXI=-1;

        if(periodOfDay.equals("day")){

            TAXI=0.79;
        }

        if(periodOfDay.equals("night")){

            TAXI=0.90;
        }

        if(n<20){

            price=TAXI_STARTING_FEE+TAXI*n;
        }

        else if(n<100){

            price=BUS*n;
        }

        else{

            price=TRAIN*n;
        }

        System.out.println(price);
    }
}
