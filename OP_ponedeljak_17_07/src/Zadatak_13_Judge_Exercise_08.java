import java.util.Scanner;

public class Zadatak_13_Judge_Exercise_08 {

    public static double count(String text){

        int n=text.length();

        char firstLetter=text.charAt(0);
        char lastLetter=text.charAt(n-1);
        String textBetween=text.substring(1, n-1);
        double numberBetween=Double.parseDouble(textBetween);

        if(!Character.isLetter(firstLetter) || !Character.isLetter(lastLetter)) return 0;

        if(Character.isUpperCase(firstLetter)){

            int alphabetPosition=(int)firstLetter-(int)'A'+1;
            numberBetween=numberBetween/alphabetPosition;
        }

        else{

            int alphabetPosition=(int)firstLetter-(int)'a'+1;
            numberBetween=numberBetween*alphabetPosition;
        }

        if(Character.isUpperCase(lastLetter)){

            int alphabetPosition=(int)lastLetter-(int)'A'+1;
            numberBetween=numberBetween-alphabetPosition;
        }

        else{

            int alphabetPosition=(int)lastLetter-(int)'a'+1;
            numberBetween=numberBetween+alphabetPosition;
        }

        return numberBetween;


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split("\\s+");

        double addition=0;

        for(String s: parts){

            if(!s.equals(" ")){

                double result=count(s);
                addition+=result;
            }
        }

        System.out.printf("%.2f", addition);
    }
}
