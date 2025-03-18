import java.util.Scanner;

public class Zadatak_07_Judge_Lab_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String typeOfDay=sc.nextLine();
        int ageOfPerson=Integer.parseInt(sc.nextLine());

        if(ageOfPerson>=0 && ageOfPerson<=18) {

            switch (typeOfDay) {

                case "Weekday":
                    System.out.println(12 + "$");
                    break;

                case "Weekend":
                    System.out.println(15 + "$");
                    break;

                case "Holiday":
                    System.out.println(5 + "$");
                    break;

                default:

            }

        }

        else if(ageOfPerson>=0 && ageOfPerson<=64){

            switch (typeOfDay) {

                case "Weekday":
                    System.out.println(18 + "$");
                    break;

                case "Weekend":
                    System.out.println(20 + "$");
                    break;

                case "Holiday":
                    System.out.println(12 + "$");
                    break;

                default:

            }

            }

        else if (ageOfPerson>=0 && ageOfPerson<=122){

            switch (typeOfDay) {

                case "Weekday":
                    System.out.println(12 + "$");
                    break;

                case "Weekend":
                    System.out.println(15 + "$");
                    break;

                case "Holiday":
                    System.out.println(10 + "$");
                    break;

                default:
            }
        }

        else{

            System.out.println("Error!");
        }

    }
}


