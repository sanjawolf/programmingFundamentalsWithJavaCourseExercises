import java.util.Scanner;

public class Zadatak_11_Exercise_08 {

    public  static double firstLowerOrUpper(String part){

        char firstCharacter=part.charAt(0);

        double number=Double.parseDouble(part.substring(1, part.length()-1));

        if(firstCharacter>='A' && firstCharacter<='Z'){

            number=number/((int)firstCharacter-(int) 'A'+1);
        }

        else if(firstCharacter>='a' && firstCharacter<='z'){

            number=number*((int)firstCharacter-(int) 'a'+1);
        }

        return  number;
    }

    public  static double lastLowerOrUpper(String part){

        char firstCharacter=part.charAt(part.length()-1);

        double number=Double.parseDouble(part.substring(1, part.length()-1));

        if(firstCharacter>='A' && firstCharacter<='Z'){

            number=firstLowerOrUpper(part)-((int)firstCharacter-(int) 'A'+1);
        }

        else if(firstCharacter>='a' && firstCharacter<='z'){

            number=firstLowerOrUpper(part)+((int)firstCharacter-(int) 'a'+1);
        }

        return  number;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split("\\s+");

        double sum=0;

        for(String part: parts){

        double number1=firstLowerOrUpper(part);

        double number2=lastLowerOrUpper(part);

        sum+=number2;

//            System.out.println(part);

        }

        System.out.printf("%.2f", sum);
    }
}
