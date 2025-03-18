import java.awt.font.ShapeGraphicAttribute;
import java.util.Scanner;
import java.util.SplittableRandom;

public class String_Manipulator_Problem {

    public static String translate(String s, String character, String replacement){

        s=s.replace(character, replacement);
        return s;
    }

    public static void includes(String s, String substring){

        if(s.contains(substring)) System.out.println("True");
        else System.out.println("False");
    }

    public static void start(String s, String substring){

        String substring1=s.substring(0, substring.length());

        if(substring.equals((substring1))) System.out.println("True");
        else System.out.println("False");
    }

    public static String lowercase(String s){

        s=s.toLowerCase();
        return s;
    }

    public static int findIndex(String s, String character){

        int index=s.lastIndexOf(character);
        return index;
    }

    public static String remove(String s, int startIndex, int count){

        s=s.substring(0, startIndex)+s.substring(startIndex+count);
        return s;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String string=sc.nextLine();

        while(true) {

            String command = sc.nextLine();

            if (command.equals("End")) break;

            String[] commandParts = command.split(" ");

            String firstPart = commandParts[0];

            if(firstPart.equals("Translate")){

                String character=commandParts[1];

                String replacement=commandParts[2];

                string=translate(string, character, replacement);

                System.out.println(string);
            }

            if(firstPart.equals("Includes")){

                String substring=commandParts[1];

                includes(string, substring);
            }

            if(firstPart.equals("Start")){

                String substring=commandParts[1];

                start(string, substring);
            }

            if(firstPart.equals("Lowercase")){

                string=lowercase(string);
                System.out.println(string);
            }

            if(firstPart.equals("FindIndex")){

                String character=commandParts[1];

                int index=findIndex(string, character);

                System.out.println(index);
            }

            if(firstPart.equals("Remove")){

                int startIndex=Integer.parseInt(commandParts[1]);

                int count=Integer.parseInt(commandParts[2]);

                string=remove(string, startIndex, count);

                System.out.println(string);
            }
        }
    }
}
