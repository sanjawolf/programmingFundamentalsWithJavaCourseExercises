import java.util.Scanner;

public class String_Game_Problem {

    public static String change(String s, String character, String replacement) {

        s = s.replace(character, replacement);
        return s;
    }

    public static void includes(String s, String substring) {

        if (s.contains(substring)) System.out.println("True");
        else System.out.println("False");
    }

    public static void end(String string, String substring){

        if(substring.equals(string.substring(string.length()-substring.length()))){

            System.out.println("True");
        }

        else{

            System.out.println("False");
        }
    }

    public static String uppercase(String s){

        s=s.toUpperCase();
        return s;
    }

    public static int findIndex(String s, String character){

        int index=s.indexOf(character);
        return index;
    }

    public static String cut(String s, int startIndex, int count){

        s=s.substring(startIndex, startIndex+count);
        return s;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();

        while (true) {

            String command = sc.nextLine();

            if (command.equals("Done")) break;

            String[] commandParts = command.split(" ");

            String firstPart = commandParts[0];

            if (firstPart.equals("Change")) {

                String character = commandParts[1];

                String replacement = commandParts[2];

                string = change(string, character, replacement);

                System.out.println(string);
            }

            if (firstPart.equals("Includes")) {

                String substring = commandParts[1];

                includes(string, substring);
            }

            if(firstPart.equals("End")){

                String substring = commandParts[1];

                end(string, substring);
            }

            if(firstPart.equals("Uppercase")){

                string=uppercase(string);
                System.out.println(string);
            }

            if(firstPart.equals("FindIndex")){

                String character=commandParts[1];

                int index=findIndex(string, character);

                System.out.println(index);
            }

            if(firstPart.equals("Cut")){

                int startIndex=Integer.parseInt(commandParts[1]);

                int count=Integer.parseInt(commandParts[2]);

                string=cut(string, startIndex, count);

                System.out.println(string);

            }

        }
    }

}
