import java.util.Scanner;

public class Zadatak_06_Exercise_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(", ");

        for(String part: parts){

            boolean isNumberLetterHyphenUndescore=true;

            if(part.length()>=3 && part.length()<=16){

                for(int i=0; i<part.length(); i++) {

                    char character=part.charAt(i);

                    if (character!='-' && !Character.isLetterOrDigit(character) && character!='_') {

                        isNumberLetterHyphenUndescore=false;
                        break;
                    }

                }

                if(isNumberLetterHyphenUndescore) System.out.println(part);
            }



        }






    }
}
