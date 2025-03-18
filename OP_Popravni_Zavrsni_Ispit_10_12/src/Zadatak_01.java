import java.util.Scanner;

public class Zadatak_01 {

    public static String makeUpper(String s, int index){

        String character=s.charAt(index)+"";
        s=s.substring(0, index)+character.toUpperCase()+s.substring(index+1);
        return s;
    }

    public static String makeLower(String s, int index){

        String character=s.charAt(index)+"";
        s=s.substring(0, index)+character.toLowerCase()+s.substring(index+1);
        return s;
    }

    public static String insert(String s, int index, String character){

        StringBuilder sb=new StringBuilder(s);
        sb.insert(index, character);
        return sb.toString();
    }

    public static String replace(String s, String character, int value){

        char character1=character.charAt(0);
        int ascii=character1;

        int sum=ascii+value;

        s=s.replace(character, (char)sum+"");
        return s;
    }

    public static void length(String s){

        int n=s.length();

        if(n<8) System.out.println("Password must be at least 8 characters long!");
    }

    public static void containsLettersDigitsUnderscore(String s){

        for(char c: s.toCharArray()){

            if(!(c>='a' && c<='z' || c>='A' && c<='Z' || c>='0' && c<='9' || c=='_')){

                System.out.println("Password must consist only of letters, digits and _!");
            }
        }

    }

    public static void containsOneUpperCase(String s){

        boolean contains=false;

        for(char c: s.toCharArray()){

            if(c>='A' && c<='Z'){

               contains=true;
            }
        }

        if(!contains) System.out.println("Password must consist at least one uppercase letter!");
    }

    public static void containsOneLowerCase(String s){

        boolean contains=false;

        for(char c: s.toCharArray()){

            if(c>='a' && c<='z'){

                contains=true;
            }
        }

        if(!contains) System.out.println("Password must consist at least one lowercase letter!");
    }

    public static void containsOneDigit(String s){

        boolean contains=false;

        for(char c: s.toCharArray()){

            if(c>='0' && c<='9'){

                contains=true;
            }
        }

        if(!contains) System.out.println("Password must consist at least one digit!");
    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String password=sc.nextLine();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Complete")) break;

            String [] commandParts=command.split(" ");

            String firstPart=commandParts[0];

            if(firstPart.equals("Make")){

                String secondPart=commandParts[1];
                int index=Integer.parseInt(commandParts[2]);

                if(secondPart.equals("Upper")){

                    password=makeUpper(password, index);
                    System.out.println(password);
                }

                if(secondPart.equals("Lower")){

                    password=makeLower(password, index);
                    System.out.println(password);
                }
            }

            if(firstPart.equals("Insert")){

                int index=Integer.parseInt(commandParts[1]);

                String character=commandParts[2];

                if(index>=0 && index<password.length()){

                    password=insert(password, index, character);
                    System.out.println(password);
                }

            }

            if(firstPart.equals("Replace")){

                String character=commandParts[1];

                int value=Integer.parseInt(commandParts[2]);

                if(password.contains(character)){

                    password=replace(password, character, value);
                    System.out.println(password);

                }
            }

            if(firstPart.equals("Validation")){

                length(password);
                containsLettersDigitsUnderscore(password);
                containsOneUpperCase(password);
                containsOneLowerCase(password);
                containsOneDigit(password);
            }
        }
    }
}
