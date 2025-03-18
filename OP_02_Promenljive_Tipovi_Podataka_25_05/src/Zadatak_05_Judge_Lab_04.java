import java.util.Scanner;

public class Zadatak_05_Judge_Lab_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String city=sc.nextLine();
        int population=Integer.parseInt(sc.nextLine());
        short area=Short.parseShort(sc.nextLine());

        System.out.printf("City of %s has population of %d and area %d square km.", city, population, area);
    }
}
