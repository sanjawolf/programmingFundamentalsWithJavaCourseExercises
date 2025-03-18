import java.util.Scanner;

public class Zadatak_01_02_27 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite datum: ");

        String date=sc.nextLine();

        String [] numbers=date.split("\\. ");

        int day= Integer.parseInt(numbers[0]);

        int month= Integer.parseInt(numbers[1]);

        int year= Integer.parseInt(numbers[2]);

        switch (month){

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if(day<=31) System.out.println("Datum je korektan.");
                else System.out.println("Datum nije korektan.");
                break;

            case 4: case 6: case 9: case 11:
                if(day<=30) System.out.println("Datum je korektan.");
                else System.out.println("Datum nije korektan.");
                break;

            case 2:
                if(year%4==0){

                    if(day<=29) System.out.println("Datum je korektan.");
                    else System.out.println("Datum nije korektan.");
                }

                else{

                    if(day<=28) System.out.println("Datum je korektan.");
                    else System.out.println("Datum nije korektan.");

                }
                break;

            default:
                System.out.println("Datum nije korektan.");
                break;
        }
    }
}
