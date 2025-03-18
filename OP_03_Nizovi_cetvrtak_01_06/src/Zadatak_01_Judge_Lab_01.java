import java.util.Scanner;

public class Zadatak_01_Judge_Lab_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String [] daysOfWeek= {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        int i=Integer.parseInt(sc.nextLine());

        if(i>=1 && i<=7){

            System.out.println(daysOfWeek[i-1]);
        }

        else{

            System.out.println("Invalid day!");
        }
    }
}
