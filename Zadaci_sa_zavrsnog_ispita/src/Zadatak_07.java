import java.util.Scanner;

public class Zadatak_07 {

    public static StringBuilder takeOdd(String part){

        StringBuilder sb=new StringBuilder();

        for(int i=0; i<part.length(); i++){

            if(i%2!=0) sb.append(part.charAt(i));
        }

        return sb;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String string=sc.nextLine();

        while(true) {

            String command = sc.nextLine();

            if (command.equals("Done")) break;

            String[] parts = command.split(" ");

            String firstPart = parts[0];

            if (firstPart.equals("TakeOdd")) {

                string = takeOdd(string).toString();

                System.out.println(string);
            }

            if (firstPart.equals("Cut")) {

                int secondPart = Integer.parseInt(parts[1]);

                int thirdPart = Integer.parseInt(parts[2]);

                String substring = string.substring(secondPart, secondPart + thirdPart);

                string = string.replace(substring, "");

                System.out.println(string);
            }

            if (firstPart.equals("Substitute")){

                String secondPart=parts[1];

                String thirdPart=parts[2];

                if(string.contains(secondPart)){

                    string=string.replaceAll(secondPart, thirdPart);
                    System.out.println(string);
                }

                else{

                    System.out.println("Nothing to replace!");
                }
            }
        }

        System.out.printf("Your password is: %s", string);
    }
}
