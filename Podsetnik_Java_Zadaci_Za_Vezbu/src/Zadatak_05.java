import java.util.Scanner;

public class Zadatak_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int poolVolumeInLiters=Integer.parseInt(sc.nextLine());
        int hourlyFlowRateOfFirstTube=Integer.parseInt(sc.nextLine());
        int hourlyFlowRateOfSecondTube=Integer.parseInt(sc.nextLine());
        double numberOfHoursEmployeeAbsent=Double.parseDouble(sc.nextLine());

        double isFullPool=numberOfHoursEmployeeAbsent*(hourlyFlowRateOfFirstTube+hourlyFlowRateOfSecondTube);

        if(isFullPool<=poolVolumeInLiters){

            double fullPool=Math.floor(100*isFullPool/poolVolumeInLiters);
            double firstTube=Math.floor(100*numberOfHoursEmployeeAbsent*hourlyFlowRateOfFirstTube/isFullPool);
            double secondTube=Math.floor(100*numberOfHoursEmployeeAbsent*hourlyFlowRateOfSecondTube/isFullPool);
            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.", fullPool, firstTube, secondTube);

        }

       else{

            double difference=isFullPool-poolVolumeInLiters;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", numberOfHoursEmployeeAbsent, difference);

        }

    }
}
