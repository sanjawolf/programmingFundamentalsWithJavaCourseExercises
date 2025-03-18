import java.util.Scanner;

public class Zadatak_01_02_28 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite datum: ");

        String date=sc.nextLine();

        String [] numbers=date.split("\\.");

        int day=Integer.parseInt(numbers[0]);

        int month=Integer.parseInt(numbers[1]);

        int year=Integer.parseInt(numbers[2]);

        switch(month){

            case 1:

                if(day==1){

                    System.out.println("Prethodni datum: ");
                    System.out.printf("31.12.%d.", year-1);
                }

                else{

                    System.out.println("Prethodni datum: ");
                    System.out.printf("%d.%d.%d.", day-1, month, year);
                }
                break;

            case 3:

                if(day==1){

                    if(year%4==0){

                        System.out.println("Prethodni datum: ");
                        System.out.printf("29.%d.%d.", month-1, year);
                    }

                    else{

                        System.out.println("Prethodni datum: ");
                        System.out.printf("28.%d.%d.", month-1, year);
                    }
                }

                else{

                    System.out.println("Prethodni datum: ");
                    System.out.printf("%d.%d.%d.", day-1, month, year);
                }
                break;



            case 2: case 4: case 6: case 9: case 11:

                if(day==1){

                    System.out.println("Prethodni datum: ");
                    System.out.printf("31.%d.%d.", month-1, year);
                }

                else{

                    System.out.println("Prethodni datum: ");
                    System.out.printf("%d.%d.%d.", day-1, month, year);
                }
                break;

            case 5: case 7: case 8: case 10: case 12:

                if(day==1){

                    System.out.println("Prethodni datum: ");
                    System.out.printf("30.%d.%d.", month-1, year);
                }

                else{

                    System.out.println("Prethodni datum: ");
                    System.out.printf("%d.%d.%d.", day-1, month, year);
                }
                break;

            default:
        }
    }
}
