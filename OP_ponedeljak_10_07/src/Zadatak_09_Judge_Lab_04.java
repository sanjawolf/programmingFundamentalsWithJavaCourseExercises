import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_09_Judge_Lab_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String [] fruits=sc.nextLine().split(" ");

        String [] fruitsFiltered= Arrays.stream(fruits)
                .filter(e->e.length()%2==0)
                .toArray(String[]::new);

        for(String s: fruitsFiltered){

            System.out.println(s);
        }


    }
}
