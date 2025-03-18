import java.util.Scanner;

public class Zadatak_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String email=sc.nextLine();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Complete")) break;

            String [] parts=command.split(" ");

            String firstPart=parts[0];

            if(firstPart.equals("Make")){

                String secondPart=parts[1];

                if(secondPart.equals("Lower")){

                    email=email.toLowerCase();
                    System.out.println(email);
                }
                if(secondPart.equals("Upper")){

                    email=email.toUpperCase();
                    System.out.println(email);
                }
            }

            if(firstPart.equals("GetDomain")){

                String secondPart=parts[1];
                int count=Integer.parseInt(secondPart);
                String domain=email.substring(email.length()-count);
                System.out.println(domain);
            }

            if(firstPart.equals("GetUsername")){

                if(email.contains("@")){

                    String [] emailParts=email.split("@");

                    System.out.println(emailParts[0]);

                }

                else{

                    System.out.printf("The email %s doesn't contain the @ symbol.\n", email);
                }
            }

            if(firstPart.equals("Replace")){

                String secondPart=parts[1];
                email=email.replaceAll(secondPart, "-");
                System.out.println(email);
            }

            if(firstPart.equals("Encrypt")){

                for(char c: email.toCharArray()){

                    System.out.printf("%d ", (int)c);
                }
            }
        }
    }
}
