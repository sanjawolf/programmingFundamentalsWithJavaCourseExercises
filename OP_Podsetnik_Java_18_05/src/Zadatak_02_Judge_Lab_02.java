import java.util.Scanner;

public class Zadatak_02_Judge_Lab_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double grade=Double.parseDouble(sc.nextLine());

        if(grade>=3.00){

            System.out.println("Passed!");
        }
    }
}
