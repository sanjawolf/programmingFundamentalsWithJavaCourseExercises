import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_03_Lab_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String [] words= Arrays.stream(sc.nextLine().split(" "))
                .filter(x -> x.length()%2==0)
                .toArray(String[]::new);

        for(String s: words) System.out.println(s);
    }
}
