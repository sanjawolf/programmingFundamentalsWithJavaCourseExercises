import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_09_Lists_Exercise_02 {

    public static void readList(ArrayList<Integer> list, String text){

        String [] parts=text.split(" ");

        for(int i=0; i<parts.length; i++){

            list.add(Integer.parseInt(parts[i]));
        }
    }

    public static void deleteAllElements(ArrayList<Integer> list, int number){

        for(int i=0; i< list.size(); i++){

            int element=list.get(i);

            if(element==number){

                list.remove(Integer.valueOf(element));

            }
        }
    }

    public static void writeList(ArrayList<Integer> list){

        for(int element: list){

            System.out.printf("%d ", element);
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> list=new ArrayList<>();

        String text= sc.nextLine();

        readList(list, text);

        while(true){

            String command=sc.nextLine();

            if(command.equals("end")) break;

            String [] commandParts=command.split(" ");

            int element=Integer.parseInt(commandParts[1]);

            if(commandParts[0].equals("Delete")){

                deleteAllElements(list, element);

            }

            if(commandParts[0].equals("Insert")){

                int position=Integer.parseInt(commandParts[2]);
                list.add(position, element);
            }

        }

        writeList(list);
    }
}
