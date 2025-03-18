import java.util.Scanner;

public class Zadatak_06_Judge_Exercise_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfPeople=Integer.parseInt(sc.nextLine());
        int capacity=Integer.parseInt(sc.nextLine());

        int courses=numberOfPeople/capacity;

        if (numberOfPeople%capacity!=0){

            courses=courses+1;
        }

        System.out.println(courses);









    }
}
