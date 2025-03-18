import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String  [] parts=text.split(", ");

        ArrayList<String> list=new ArrayList<>();

        for(int i=0; i<parts.length; i++){

            list.add(parts[i]);
        }

        while(true){

            String command=sc.nextLine();

            if(command.equals("Craft!")) break;

            String [] commandParts=command.split(" - ");

            if(commandParts[0].equals("Collect")){

                if(!list.contains(commandParts[1])){

                list.add(commandParts[1]);

                }
            }

            if(commandParts[0].equals("Drop")){

                if(list.contains(commandParts[1])){

                    list.remove(commandParts[1]);

                }
            }

            if(commandParts[0].equals("Combine Items")){

                String [] command1Parts=commandParts[1].split(":");

                if(list.contains(command1Parts[0])){

                    int indexOldItem=list.indexOf(command1Parts[0]);

                    list.add(indexOldItem+1, command1Parts[1]);
                }
            }

            if(commandParts[0].equals("Renew")){

                if(list.contains(commandParts[1])){

                    list.remove(commandParts[1]);

                    list.add(commandParts[1]);

                }
            }

        }

        for(int i=0; i<list.size(); i++){

            if(i!=list.size()-1) System.out.printf("%s, ", list.get(i));
            else System.out.printf("%s", list.get(i));
        }

    }
}
