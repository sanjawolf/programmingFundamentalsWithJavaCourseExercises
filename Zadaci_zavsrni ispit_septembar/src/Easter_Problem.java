import java.util.Scanner;

public class Easter_Problem {

    public static String replace(String s, String currentChar, String newChar){

        s=s.replace(currentChar, newChar);
        return s;
    }

    public static String remove(String s, String substring){

        int index=s.indexOf(substring);
        if(index>=0 && index<s.length()) s=s.substring(0, index)+s.substring(index+substring.length());
        return s;
    }

    public static void includes(String s, String substring){

        if(s.contains(substring)) System.out.println("True");
        else System.out.println("False");
    }

    public static String changeLower(String s){

        s=s.toLowerCase();
        return s;
    }

    public static String changeUpper(String s){

        s=s.toUpperCase();
        return s;
    }

    public static String reverse(String s, int startIndex, int endIndex){

        String substring=s.substring(startIndex, endIndex+1);
        StringBuilder sb=new StringBuilder(substring);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String string=sc.nextLine();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Easter")) break;

            String [] commandParts=command.split(" ");

            String firstPart=commandParts[0];

            if(firstPart.equals("Replace")){

                String currentChar=commandParts[1];

                String newChar=commandParts[2];

                string=replace(string, currentChar, newChar);

                System.out.println(string);

            }

            if(firstPart.equals("Remove")){

                String substring=commandParts[1];

                string=remove(string, substring);

                System.out.println(string);
            }

            if(firstPart.equals("Includes")){

                String substring=commandParts[1];

                includes(string, substring);

            }

            if(firstPart.equals("Change")){

                String secondPart=commandParts[1];

                if(secondPart.equals("Lower")){

                    string=changeLower(string);
                    System.out.println(string);
                }

                if(secondPart.equals("Upper")){

                    string=changeUpper(string);
                    System.out.println(string);
                }
            }

            if(firstPart.equals("Reverse")){

                int startIndex= Integer.parseInt(commandParts[1]);
                int endIndex=Integer.parseInt(commandParts[2]);

                if(startIndex>=0 && startIndex<string.length() && endIndex>=0 && endIndex<string.length()){

                    String substring=reverse(string, startIndex, endIndex);
                    System.out.println(substring);
                }
            }

        }
    }
}
