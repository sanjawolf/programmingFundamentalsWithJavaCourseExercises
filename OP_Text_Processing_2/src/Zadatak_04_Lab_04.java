import java.util.Scanner;

public class Zadatak_04_Lab_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String bannedWords=sc.nextLine();
        String text=sc.nextLine();

        String [] parts=bannedWords.split(", ");

        for(String s: parts){

            String rez="";

            if(text.contains(s)){

                for(int i=0; i<s.length(); i++){

                   rez+="*";
                }

                text=text.replace(s, rez);
            }
        }

        System.out.println(text);
    }
}
