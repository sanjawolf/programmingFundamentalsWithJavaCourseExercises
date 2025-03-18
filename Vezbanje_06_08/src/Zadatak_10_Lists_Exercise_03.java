import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_10_Lists_Exercise_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfCommands=Integer.parseInt(sc.nextLine());

        ArrayList<String> list=new ArrayList<>();

        for(int i=1; i<=numberOfCommands; i++){

            String command=sc.nextLine();

            String [] commandParts=command.split(" ");

            if(commandParts.length==4){

                if(!list.contains(commandParts[0])){

                    System.out.printf("%s is not in the list!\n", commandParts[0]);
                }

                else{

                    list.remove(commandParts[0]);
                }

            }

            else{

                if(!list.contains(commandParts[0])){

                    list.add(commandParts[0]);
                }

                else{

                    System.out.printf("%s is already in the list!\n", commandParts[0]);
                }
            }
        }

        for(String s: list){

            System.out.println(s);
        }
    }
}
