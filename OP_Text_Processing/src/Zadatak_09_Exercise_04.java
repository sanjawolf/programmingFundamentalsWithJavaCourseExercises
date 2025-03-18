import java.util.Scanner;

public class Zadatak_09_Exercise_04 {

    public  static char encrypt(char character){

        char encrypted=(char)((int)character+3);

        return encrypted;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String encrypted="";

        for(int i=0; i<text.length(); i++){

           char rez=encrypt(text.charAt(i));

           encrypted+=rez;
        }

        System.out.println(encrypted);

    }
}
