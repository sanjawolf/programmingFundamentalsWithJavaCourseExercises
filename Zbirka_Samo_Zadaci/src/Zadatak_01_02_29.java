import java.util.Scanner;

public class Zadatak_01_02_29 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite datum: ");

        String date=sc.nextLine();

        String [] numbers=date.split("\\.");

        int day=Integer.parseInt(numbers[0]);

        int month=Integer.parseInt(numbers[1]);

        int year=Integer.parseInt(numbers[2]);

        switch(month){

            case 12:

                if(day==31){

                    System.out.println("Naredni datum: ");
                    System.out.printf("1.1.%d.", year+1);
                }

                else{

                    System.out.println("Naredni datum: ");
                    System.out.printf("%d.%d.%d.", day+1, month, year);
                }
                break;

            case 2:

                if(day==28 || day==29){

                    System.out.println("Naredni datum: ");
                    System.out.printf("1.%d.%d.", month+1, year);
                }

                else{

                    System.out.println("Naredni datum: ");
                    System.out.printf("%d.%d.%d.", day+1, month, year);
                }
                break;



            case 3: case 5: case 7: case 8: case 10:

                if(day==31){

                    System.out.println("Naredni datum: ");
                    System.out.printf("1.%d.%d.", month+1, year);
                }

                else{

                    System.out.println("Naredni datum: ");
                    System.out.printf("%d.%d.%d.", day+1, month, year);
                }
                break;

            case 4: case 6: case 9: case 11:

                if(day==30){

                    System.out.println("Naredni datum: ");
                    System.out.printf("1.%d.%d.", month+1, year);
                }

                else{

                    System.out.println("Naredni datum: ");
                    System.out.printf("%d.%d.%d.", day+1, month, year);
                }
                break;

            default:
        }
    }
}
