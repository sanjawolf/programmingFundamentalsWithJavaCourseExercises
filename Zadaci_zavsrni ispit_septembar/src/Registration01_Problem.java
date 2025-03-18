import java.util.Scanner;

public class Registration01_Problem {

    public static String lettersLower(String s){

        s=s.toLowerCase();
        return s;
    }

    public static String lettersUpper(String s){

        s=s.toUpperCase();
        return s;
    }

    public static String reverse(String s){

        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();

    }

    public static String substring(String s, String substring){

        s=s.replace(substring, "");
        return  s;
    }

    public static String replace(String s, String character){

        s=s.replace(character, "-");
        return  s;
    }

    public static void isValid(String s, String character){

        if(s.contains(character)) System.out.println("Valid username.");
        else System.out.printf("%s must be contained in your username.\n", character);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String username=sc.nextLine();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Registration")) break;

            String [] commandParts=command.split(" ");

            String firstPart=commandParts[0];

            if(firstPart.equals("Letters")){

                String secondPart=commandParts[1];

                if(secondPart.equals("Lower")){

                    username=lettersLower(username);
                    System.out.println(username);
                }

                if(secondPart.equals("Upper")){

                    username=lettersUpper(username);
                    System.out.println(username);
                }

            }

            if(firstPart.equals("Reverse")){

                int startIndex=Integer.parseInt(commandParts[1]);
                int lastIndex=Integer.parseInt(commandParts[2]);

                String substring=username.substring(startIndex, lastIndex+1);

                if(startIndex>=0 && startIndex<username.length()-1 && lastIndex>=0 && lastIndex<username.length()-1){

                    substring=reverse(substring);
                    System.out.println(substring);
                }

            }

            if(firstPart.equals("Substring")){

                String substring=commandParts[1];

                if(username.contains(substring)){

                    username=substring(username, substring);
                    System.out.println(username);
                }

                else{

                    System.out.printf("The username %s doesn't contain %s.\n", username, substring);
                }

            }

            if(firstPart.equals("Replace")){

                String character=commandParts[1];

                username=replace(username, character);

                System.out.println(username);
            }

            if(firstPart.equals("IsValid")){

                String character=commandParts[1];

                isValid(username, character);

            }




        }
    }
}
