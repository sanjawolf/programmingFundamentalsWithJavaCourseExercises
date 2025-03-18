import java.util.Scanner;

public class Zadatak_01_02_26 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite godinu: ");

        int year=Integer.parseInt(sc.nextLine());

        System.out.print("Unesite mesec: ");

        int month=Integer.parseInt(sc.nextLine());

        switch(month){

            case 1:
                System.out.println("Januar, 31 dan");
                break;

            case 2:
                if(year%4==0) System.out.printf("Februar, 29 dana");
                else System.out.println("Februar, 28 dana");
                break;

            case 3:
                System.out.println("Mart, 31 dan");
                break;

            case 4:
                System.out.println("April, 30 dana");
                break;

            case 5:
                System.out.println("Maj, 30 dana");
                break;

            case 6:
                System.out.println("Jun, 30 dana");
                break;

            case 7:
                System.out.println("Jul, 31 dan");
                break;

            case 8:
                System.out.println("Avgust, 31 dan");
                break;

            case 9:
                System.out.println("Septembar, 30 dana");
                break;

            case 10:
                System.out.println("Oktobar, 31 dan");
                break;

            case 11:
                System.out.println("Novembar, 30 dana");
                break;

            case 12:
                System.out.println("Decembar, 31 dan");
                break;

            default:
                System.out.println("Greska: neispravan unos meseca.");
        }
    }
}
