import java.util.Scanner;

public class Password_Reset_Problem {

    public static String takeOdd(String s){

        StringBuilder sb=new StringBuilder();

        for(int i=0; i<s.length(); i++){

            if(i%2!=0){

                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String cut(String s, int index, int length){

        s=s.substring(0, index)+s.substring(index+length);
        return s;
    }

    public static String substitute(String s, String substring, String substitute){

        s=s.replace(substring, substitute);
        return s;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String string=sc.nextLine();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Done")) break;

            String [] commandParts=command.split(" ");

            String firstPart=commandParts[0];

            if(firstPart.equals("TakeOdd")){

                string=takeOdd(string);
                System.out.println(string);
            }

            if(firstPart.equals("Cut")){

                int index=Integer.parseInt(commandParts[1]);

                int length=Integer.parseInt(commandParts[2]);

                string=cut(string, index, length);

                System.out.println(string);
            }

            if(firstPart.equals("Substitute")){

                String substring=commandParts[1];

                String substitute=commandParts[2];

                if(string.contains(substring)){

                    string=substitute(string, substring, substitute);
                    System.out.println(string);
                }

                else{

                    System.out.println("Nothing to replace!");
                }
            }




        }

        System.out.printf("Your password is: %s\n", string);
    }
}
