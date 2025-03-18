import java.util.Scanner;

public class Zadatak_06_Judge_Lab_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String name1=sc.nextLine();
        String name2=sc.nextLine();
        String delimiter=sc.nextLine();

        System.out.printf("%s%s%s", name1, delimiter, name2);
    }
}
