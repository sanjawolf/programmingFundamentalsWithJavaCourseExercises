import java.util.Scanner;

public class Email_Validator_Problem {

    public static String  makeUpper(String s){

        s=s.toUpperCase();
        return s;
    }

    public static String makeLower(String s){

        s=s.toLowerCase();
        return s;
    }

    public static String getDomain(String s, int count){

        s=s.substring(s.length()-count);
        return s;
    }

    public static void getUsername(String s){

        if(s.contains("@")) {

            s=s.substring(0, s.indexOf("@"));
            System.out.println(s);
        }
        else{

            System.out.printf("The email %s doesn't contain the @ symbol.\n", s);
        }


    }

    public static String replace(String s, String character){

        s=s.replace(character, "-");
        return s;
    }

    public static String encrypt(String s){

        for(int i=0; i<s.length(); i++){

            System.out.printf("%d ", (int)s.charAt(i));
        }

        return "";
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String email=sc.nextLine();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Complete")) break;

            String [] commandParts=command.split(" ");

            String firstPart=commandParts[0];

            if(firstPart.equals("Make")){

                String secondPart=commandParts[1];

                if(secondPart.equals("Upper")){

                    email=makeUpper(email);
                    System.out.println(email);
                }
                else{

                    email=makeLower(email);
                    System.out.println(email);
                }
            }

            if(firstPart.equals("GetDomain")){

                int count= Integer.parseInt(commandParts[1]);

                String email2=getDomain(email, count);

                System.out.println(email2);
            }

            if(firstPart.equals("GetUsername")){

                getUsername(email);
            }

            if(firstPart.equals("Replace")){

                String character=commandParts[1];

                email=replace(email, character);

                System.out.println(email);

            }

            if(firstPart.equals("Encrypt")){

                email=encrypt(email);
                System.out.println(email);
            }
        }
    }
}
