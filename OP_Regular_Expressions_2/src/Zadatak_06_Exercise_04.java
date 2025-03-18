import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_06_Exercise_04 {

    public static StringBuilder decrypted(String encrypted, int number){

        StringBuilder sb=new StringBuilder();

        for(int i=0; i<encrypted.length(); i++){

            char character=encrypted.charAt(i);

            int encryptedCharacter=(int)character-number;

            sb.append((char)encryptedCharacter);
        }

        return  sb;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        Pattern regex1=Pattern.compile("[STARstar]");

        Pattern regex2=Pattern.compile("^[^@!:>-]*@(?<planet>[A-Za-z]+)[^@!:>-]*:(?<population>\\d+)[^@!:>-]*!(?<attacktype>[AD])![^@!:>-]*->(?<soldiercount>\\d+)[^@!:>-]*$");

        ArrayList<String > attackedPlanets=new ArrayList<>();
        ArrayList<String > destroyedPlanets=new ArrayList<>();

        for(int i=1; i<=n; i++){

            String encrypted=sc.nextLine();

            int numberOfLetters=0;

            Matcher matcher1= regex1.matcher(encrypted);

            while(matcher1.find()){

                numberOfLetters++;
//                System.out.println(numberOfLetters);
            }

            StringBuilder sb=decrypted(encrypted, numberOfLetters);

//            System.out.println(sb);

            Matcher matcher2=regex2.matcher(sb.toString());

           while (matcher2.find()){

               if(matcher2.group("attacktype").equals("A")){

                   attackedPlanets.add(matcher2.group("planet"));
               }
               if(matcher2.group("attacktype").equals("D")){

                   destroyedPlanets.add(matcher2.group("planet"));
               }

           }



        }

        Collections.sort(attackedPlanets);
        Collections.sort(destroyedPlanets);

        System.out.printf("Attacked planets: %d\n", attackedPlanets.size());
        for(String s: attackedPlanets) System.out.printf("-> %s\n", s);
        System.out.printf("Destroyed planets: %d\n", destroyedPlanets.size());
        for(String s: destroyedPlanets) System.out.printf("-> %s\n", s);


    }
}
