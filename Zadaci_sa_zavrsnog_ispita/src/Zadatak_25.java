import java.util.Scanner;

public class Zadatak_25 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String string="";

        while(true){

            String command=sc.nextLine();

            if(command.equals("End")) break;

            String [] commandParts=command.split(" ");

            String firstPart=commandParts[0];

            if(firstPart.equals("Add")){

                String substring=commandParts[1];

                string=string.concat(substring);
            }

            if(firstPart.equals("Upgrade")){

                String character=commandParts[1];

                for(int i=0; i<string.length(); i++){

                    if(character.equals(string.charAt(i)+"")){

                        string=string.replace(character, (char)((int)character.charAt(0)+1)+"");
                    }
                }
            }

            if(firstPart.equals("Print")){

                System.out.println(string);
            }

            if(firstPart.equals("Index")){

                String character=commandParts[1];

                boolean found=false;

                for(int i=0; i<string.length(); i++){

                    if(character.equals(string.charAt(i)+"")){

                        System.out.printf("%d ", i);
                        found=true;
                    }

                }

                if(!found) System.out.println("None");
                else System.out.println();


            }

            if(firstPart.equals("Remove")){

                String substring=commandParts[1];

                string=string.replaceAll(substring, "");
            }
        }
    }
}
