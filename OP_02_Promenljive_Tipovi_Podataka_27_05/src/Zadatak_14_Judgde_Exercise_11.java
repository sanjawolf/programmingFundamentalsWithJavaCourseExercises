import java.util.Scanner;

public class Zadatak_14_Judgde_Exercise_11 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int N=Integer.parseInt(sc.nextLine());

        double max=Double.MIN_VALUE;
        int maxSnowballSnow=Integer.MIN_VALUE;
        int maxSnowballTime=Integer.MIN_VALUE;
        int maxSnowballQuality=Integer.MIN_VALUE;

        for(int i=1; i<=N; i++){

        int snowballSnow=Integer.parseInt(sc.nextLine());
        int snowballTime=Integer.parseInt(sc.nextLine());
        int snowballQuality=Integer.parseInt(sc.nextLine());

        double snowballValue=Math.pow((double)snowballSnow / snowballTime, snowballQuality);

        if(snowballValue>max){

            max=snowballValue;
            maxSnowballSnow=snowballSnow;
            maxSnowballTime=snowballTime;
            maxSnowballQuality=snowballQuality;
        }

        }

        System.out.printf("%d : %d = %.0f (%d)", maxSnowballSnow, maxSnowballTime, max, maxSnowballQuality);
    }
}
