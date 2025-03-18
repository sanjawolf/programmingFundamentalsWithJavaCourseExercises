import java.util.Scanner;

public class Zadatak_14_Exercise_08 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split("\\s+");

        double sum=0;

        for(String part: parts){

            char firstCharacter=part.charAt(0);
            double number=Double.parseDouble(part.substring(1, part.length()-1));
            char lastCharacter=part.charAt(part.length()-1);

            if((double)firstCharacter>=65 && (double)firstCharacter<=90){

                double divide=number/((double)firstCharacter-65+1);

                if((double)lastCharacter>=65 && (double)lastCharacter<=90){

                    double subtract=divide-((double)lastCharacter-65+1);
                    sum+=subtract;
                }

                if((double)lastCharacter>=97 && (double)lastCharacter<=122){

                    double add=divide+(double)lastCharacter-97+1;
                    sum+=add;
                }
            }

            if((double)firstCharacter>=97 && (double)firstCharacter<=122){

                double multiply=number*((double)firstCharacter-97+1);

                if((double)lastCharacter>=65 && (double)lastCharacter<=90){

                    double subtract=multiply-((double)lastCharacter-65+1);
                    sum+=subtract;
                }

                if((double)lastCharacter>=97 && (double)lastCharacter<=122){

                    double add=multiply+(double)lastCharacter-97+1;
                    sum+=add;
                }
            }

        }

        System.out.printf("%.2f", sum);

    }
}
