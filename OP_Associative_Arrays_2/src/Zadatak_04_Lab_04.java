import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_04_Lab_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(" ");

        String [] even= Arrays.stream(parts)
                .filter(x -> x.length()%2==0)
                .toArray(String[]::new);

        for(String s: even) System.out.println(s);
    }
}
