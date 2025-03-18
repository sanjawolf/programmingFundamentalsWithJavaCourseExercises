import java.util.Scanner;

public class Zadatak_08 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberofDaysOff=Integer.parseInt(sc.nextLine());

        int playingTimePerDayVacation=63;
        int playingTimePerDayWork=127;
        int normForPlaying=30000;

        int playingTime=numberofDaysOff*playingTimePerDayVacation+(365-numberofDaysOff)*playingTimePerDayWork;

        if(playingTime>normForPlaying){

            int differenceHours=(playingTime-normForPlaying)/60;
            int differenceMinutes=(playingTime-normForPlaying)%60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", differenceHours, differenceMinutes);
        }

        else{

            int differenceHours=(normForPlaying-playingTime)/60;
            int differenceMinutes=(normForPlaying-playingTime)%60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", differenceHours, differenceMinutes);

        }
    }
}
