import java.util.Scanner;

public class Zadatak_03_Lab_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String word=sc.nextLine();

        String text=sc.nextLine();

        while(text.contains(word)){

            text=text.replace(word, "");

//            String [] parts=text.split(word);
//
//            text=String.join("", parts);
        }

        System.out.println(text);
    }
}
