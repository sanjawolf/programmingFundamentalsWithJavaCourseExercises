import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mirror_Words_Problem {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        String [] parts=s.split("\\s+");

        Pattern regex=Pattern.compile("([@#])(?<word1>[A-Za-z]{3,})\\1\\1(?<word2>[A-Za-z]{3,})\\1");

        ArrayList<StringBuilder> list=new ArrayList<>();

        int wordPairsNumber=0;

        for(String part: parts){

            Matcher matcher= regex.matcher(part);

            while(matcher.find()){

                String word1= matcher.group("word1");

                String word2= matcher.group("word2");

                StringBuilder sb=new StringBuilder(word1);

                StringBuilder sb1=new StringBuilder(word2);

                sb1.reverse();

                word1=sb.toString();

                word2=sb1.toString();

                wordPairsNumber++;

                if(word1.equals(word2)){

                    list.add(sb);
                }
            }

        }

        if(wordPairsNumber!=0) System.out.printf("%d word pairs found!\n", wordPairsNumber);
        else System.out.println("No word pairs found!");

        if(list.size()!=0){

            System.out.println("The mirror words are:");

            for(StringBuilder el: list){

                if(list.indexOf(el)!= list.size()-1) System.out.printf("%s <=> %s, ", el.toString(), el.reverse().toString());
                else System.out.printf("%s <=> %s\n", el.toString(), el.reverse().toString());
            }
        }

        else System.out.println("No mirror words!");
    }
}
