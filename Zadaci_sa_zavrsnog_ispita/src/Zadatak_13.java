import java.util.Scanner;

public class Zadatak_13 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String stringMessage= sc.nextLine();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Reveal")) break;

            String [] commandParts=command.split(":\\|:");

//            for(String part: commandParts) System.out.println(part);

            String firstPart=commandParts[0];

            if(firstPart.equals("InsertSpace")){

                int index= Integer.parseInt(commandParts[1]);

                StringBuilder sbMessage=new StringBuilder(stringMessage);

                sbMessage.insert(index, " ");

                stringMessage= sbMessage.toString();

                System.out.println(stringMessage);
            }

            if(firstPart.equals("Reverse")){

                String substring=commandParts[1];

                int substringLength=substring.length();

                int startIndex=stringMessage.indexOf(substring);

                int lastIndex=stringMessage.lastIndexOf(substring);

                if(stringMessage.contains(substring)){

                    String cut=stringMessage.substring(startIndex, startIndex+substringLength);

                    System.out.println(cut);

                    StringBuilder sbMessage=new StringBuilder(stringMessage);

                    sbMessage.replace(startIndex, startIndex+substringLength, "");

                    for(int i=cut.length()-1; i>=0; i--){

                        sbMessage.append(cut.charAt(i)+"");
                    }

                    stringMessage= sbMessage.toString();

                    System.out.println(stringMessage);
                }

                else{

                    System.out.println("error");
                }
            }

            if(firstPart.equals("ChangeAll")){

                String substring=commandParts[1];

                String replacement=commandParts[2];

                stringMessage=stringMessage.replaceAll(substring, replacement);

                System.out.println(stringMessage);
            }
        }

        System.out.printf("You have a new text message: %s\n", stringMessage);
    }
}
