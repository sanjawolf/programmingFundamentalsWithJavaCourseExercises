import java.util.Scanner;

public class Zadatak_10 {

    public static StringBuilder reverse(String string){

        StringBuilder sb=new StringBuilder();

        for(int i=string.length()-1; i>=0; i--){

            sb.append(string.charAt(i));
        }

        return sb;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String username=sc.nextLine();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Registration")) break;

            String [] parts=command.split(" ");

            String firstPart=parts[0];

            if(firstPart.equals("Letters")){

                String secondPart=parts[1];

                if(secondPart.equals("Lower")){

                    username=username.toLowerCase();
                    System.out.println(username);
                }

                if(secondPart.equals("Upper")){

                    username=username.toUpperCase();
                    System.out.println(username);
                }

            }

            if(firstPart.equals("Reverse")){

                int startIndex= Integer.parseInt(parts[1]);

                int endindex= Integer.parseInt(parts[2]);

                if(startIndex>=0 && endindex>=0 && startIndex<username.length() && endindex<username.length()){

                    String substring=username.substring(startIndex, endindex+1);

                    substring=reverse(substring).toString();

                    System.out.println(substring);
                }
            }

            if(firstPart.equals("Substring")){

                String secondPart=parts[1];

                if(username.contains(secondPart)){

                    username=username.replace(secondPart, "");
                    System.out.println(username);
                }

                else System.out.printf("The username %s doesn't contain %s.\n", username, secondPart);
            }

            if(firstPart.equals("Replace")){

                String character=parts[1];

                username=username.replaceAll(character, "-");
                System.out.println(username);
            }

            if(firstPart.equals("IsValid")){

                String character=parts[1];

                if(username.contains(character)) System.out.println("Valid username.");
                else System.out.printf("%s must be contained in your username.\n", character);
            }


        }
    }
}
