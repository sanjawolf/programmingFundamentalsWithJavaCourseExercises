import java.util.Scanner;

public class Zadatak_01_Arrays_Lab_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String [] days={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int number=Integer.parseInt(sc.nextLine());

        switch(number){

            case 1:
                System.out.println(days[0]);
                break;
            case 2:
                System.out.println(days[1]);
                break;
            case 3:
                System.out.println(days[2]);
                break;
            case 4:
                System.out.println(days[3]);
                break;
            case 5:
                System.out.println(days[4]);
                break;
            case 6:
                System.out.println(days[5]);
                break;
            case 7:
                System.out.println(days[6]);
                break;
            default:
                System.out.println("Invalid day!");
        }
    }
}
