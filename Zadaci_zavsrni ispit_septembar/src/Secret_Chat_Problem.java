import java.util.Scanner;

public class Secret_Chat_Problem {
    public static String insertSpace(String s, int index){

        StringBuilder sb=new StringBuilder(s);

        sb.insert(index, " ");

        return sb.toString();
    }

    public static String reverse(String s, String substring){

        int index=s.indexOf(substring);

        String string=s.substring(index, index+substring.length());

        StringBuilder sb=new StringBuilder(s);

        sb.replace(index, index+substring.length(), "");

        StringBuilder sb1=new StringBuilder(string);

        sb1.reverse();

        sb1.toString();

        sb.append(sb1);

        return sb.toString();
    }

    public static String changeAll(String s, String substring, String replacement){

    s=s.replace(substring, replacement);
    return s;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String message=sc.nextLine();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Reveal")) break;

            String [] commandParts=command.split(":\\|:");

            String firstCommand=commandParts[0];

            if(firstCommand.equals("InsertSpace")){

                int index=Integer.parseInt(commandParts[1]);

                message=insertSpace(message, index);

                System.out.println(message);
            }

            if(firstCommand.equals("Reverse")){

                String substring=commandParts[1];

                if(message.contains(substring)){

                    message=reverse(message, substring);

                    System.out.println(message);

                }

                else{

                    System.out.println("error");
                }


            }

            if(firstCommand.equals("ChangeAll")){

                String substring=commandParts[1];

                String replacement=commandParts[2];

                message=changeAll(message, substring, replacement);

                System.out.println(message);
            }
        }

        System.out.printf("You have a new text message: %s\n", message);
    }
}
