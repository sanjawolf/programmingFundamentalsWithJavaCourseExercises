import java.util.Scanner;

public class Zadatak_04_Judge_Lab_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int hours=Integer.parseInt(sc.nextLine());
        int minutes=Integer.parseInt(sc.nextLine());

        int time=hours*60+minutes;
        int timeAfter30Minutes=time+30;

        int hoursTime=time/60;
        int hoursTimeAfter30Minutes=timeAfter30Minutes/60;
        int minutesTime=time%60;
        int minutesTimeAfter30Minutes=timeAfter30Minutes%60;

        if(hoursTimeAfter30Minutes-hoursTime==1 && hoursTime!=23) {

            System.out.printf("%2d:%02d", hoursTimeAfter30Minutes, minutesTimeAfter30Minutes);

        }

        else if(hoursTime==23){

            System.out.printf("0:%02d", minutesTimeAfter30Minutes);

        }

        else{

            System.out.printf("%2d:%02d", hoursTimeAfter30Minutes, minutesTimeAfter30Minutes);

        }
    }
}
