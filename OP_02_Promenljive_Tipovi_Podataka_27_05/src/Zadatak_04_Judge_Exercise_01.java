import java.util.Scanner;

public class Zadatak_04_Judge_Exercise_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number1=Integer.parseInt(sc.nextLine());
        int number2=Integer.parseInt(sc.nextLine());
        int number3=Integer.parseInt(sc.nextLine());
        int number4=Integer.parseInt(sc.nextLine());

        int addition=number1+number2;
        int division=addition/number3;
        int multiplication=division*number4;

        System.out.println(multiplication);

    }
}
