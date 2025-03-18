import java.util.Scanner;

public class Zadatak_01_02_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite vreme: ");

        String timeText=sc.nextLine();

        String [] time=timeText.split(":");

        int hours=Integer.parseInt(time[0]);

        int minutes=Integer.parseInt(time[1]);

        if(hours<0 || hours>=24 || minutes<0 || minutes>=60) System.out.println("Greska: neispravan unos vremena.");

        else{

            int remainingMinutes;
            int remainingHours;

            if(minutes!=0){

                remainingMinutes=60-minutes;
                remainingHours=24-hours-1;
            }

            else{

                remainingMinutes=0;
                remainingHours=24-hours;
            }

            System.out.printf("Do ponoci: %d sati i %d minuta", remainingHours, remainingMinutes);
        }
    }
}
