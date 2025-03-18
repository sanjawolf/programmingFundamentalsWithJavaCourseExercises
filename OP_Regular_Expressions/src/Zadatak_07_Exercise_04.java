import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_07_Exercise_04 {

    public static String decrypt(String text){

        Pattern pattern=Pattern.compile("[starSTAR]");
        Matcher matcher= pattern.matcher(text);

        int counter=0;

        while(matcher.find()){

            counter++;

        }

        StringBuilder sb=new StringBuilder();

        for(char character: text.toCharArray()){

            char changed=(char)((int)character-counter);
            sb.append(changed);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        Pattern pattern=Pattern.compile("[^@\\-!:>]*@(?<planet>[a-zA-Z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<type>[AD])![^@\\-!:>]*->(?<soldiers>\\d+)[^@\\-!:>]*");

        ArrayList <String> attacked=new ArrayList<>();

        ArrayList <String> destroyed=new ArrayList<>();

        for(int i=1; i<=n; i++){

            String text=sc.nextLine();

            String changedText=decrypt(text);

//            System.out.println(changedText);

            Matcher matcher= pattern.matcher(changedText);

            if(matcher.find()){

                String planet= matcher.group("planet");
                String type= matcher.group("type");

                if(type.equals("A")) attacked.add(planet);
                if(type.equals("D")) destroyed.add(planet);
            }

        }

        int numberAttacked=attacked.size();
        int numberDestroyed=destroyed.size();

        Collections.sort(attacked);
        Collections.sort(destroyed);

        System.out.printf("Attacked planets: %d\n", numberAttacked);

       for(String s: attacked){

           System.out.printf("-> %s\n", s);
       }

        System.out.printf("Destroyed planets: %d\n", numberDestroyed);

        for(String s: destroyed){

            System.out.printf("-> %s\n", s);
        }
    }
}
