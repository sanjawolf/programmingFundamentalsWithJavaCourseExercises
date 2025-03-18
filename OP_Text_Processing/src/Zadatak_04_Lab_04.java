import java.util.Scanner;

public class Zadatak_04_Lab_04 {

    public  static  String asterix(String s, String part){

        String text="";

        for(int i=0; i<part.length(); i++){

            text=text.concat(s);
        }

        return text;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String bannedWord=sc.nextLine();

        String text=sc.nextLine();

        String [] parts=bannedWord.split(", ");

        for(String part: parts){

            text=text.replace(part, asterix("*", part));

        }

        System.out.println(text);
    }
}
