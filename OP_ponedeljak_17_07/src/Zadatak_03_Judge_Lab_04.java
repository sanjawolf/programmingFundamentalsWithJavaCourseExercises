import java.util.Scanner;

public class Zadatak_03_Judge_Lab_04 {

    public static String writeAsterisks(String string) {

        String rez = "";

            int n = string.length();

            for (int i = 1; i <= n; i++) {

                rez=rez.concat("*");
            }

        return rez;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();

        String[] parts = string.split(", ");

        String text = sc.nextLine();

        for(String s: parts){

            text=text.replace(s, writeAsterisks(s));
        }

        System.out.println(text);
    }


}


