import java.util.Scanner;

public class Zadatak_01_02_25 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite dan i mesec: ");

        String date=sc.nextLine();

        String [] numbers=date.split("\\.");

        int day=Integer.parseInt(numbers[0]);

        int month=Integer.parseInt(numbers[1]);

        if(month==3 && day>=21 && day<=31 || month==4 && day>=1 && day<=30 || month==5 && day>=1 && day<=31 || month==6 && day>=1 && day<=20)
            System.out.println("prolece");

        else if(month==6 && day>=21 && day<=30 || month==7 && day>=1 && day<=31 || month==8 && day>=1 && day<=31 || month==9 && day>=1 && day<=22)
            System.out.println("leto");

        else if(month==9 && day>=23 && day<=30 || month==10 && day>=1 && day<=31 || month==11 && day>=1 && day<=30 || month==12 && day>=1 && day<=21)
            System.out.println("jesen");

        else System.out.println("zima");
    }
}
