import java.util.Scanner;

public class Zadatak_19 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String string=sc.nextLine();

        while(true){

            String command=sc.nextLine();

            if(command.equals("End")) break;

            String [] parts=command.split(" ");

            String firstPart=parts[0];

            if(firstPart.equals("Translate")){

                String character=parts[1];

                String replacement=parts[2];

                string=string.replaceAll(character, replacement);

                System.out.println(string);
            }

            if(firstPart.equals("Includes")){

                String substring=parts[1];

                if(string.contains(substring)) System.out.println("True");
                else System.out.println("False");
            }

            if(firstPart.equals("Start")){

                String substring=parts[1];

                if(string.substring(0, substring.length()).equals(substring)) System.out.println("True");
                else System.out.println("False");
            }

            if(firstPart.equals("Lowercase")){

                string=string.toLowerCase();
                System.out.println(string);
            }

            if(firstPart.equals("FindIndex")){

                String character=parts[1];

                int lastIndex=string.lastIndexOf(character);

                System.out.println(lastIndex);
            }

            if(firstPart.equals("Remove")){

                int startIndex= Integer.parseInt(parts[1]);

                int count= Integer.parseInt(parts[2]);

                string=string.substring(0, startIndex)+string.substring(startIndex+count);

                System.out.println(string);
            }
        }
    }
}
