import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_08_Lists_Exercise_01 {

    public static void readList(ArrayList<Integer> list, String text){

        String [] parts=text.split(" ");

        for(int i=0; i<parts.length; i++){

            list.add(Integer.parseInt(parts[i]));
        }
    }

    public static void fitPassengers(ArrayList<Integer> list,int number1, int number2) {

       for (int i = 0; i < list.size(); i++) {

            int element = list.get(i);

            int element1=element + number1;

            if(element1<=number2) {

                list.set(i, element1);

                break;
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

        String text=sc.nextLine();

        ArrayList<Integer> list=new ArrayList<>();

        readList(list, text);

        int maxWagonCapacity=Integer.parseInt(sc.nextLine());

        while(true){

            String command=sc.nextLine();

            if(command.equals("end")) break;

            String [] commandParts=command.split(" ");

            if(commandParts.length==2){

                int number1=Integer.parseInt(commandParts[1]);

                list.add(number1);

            }

            else{

                int number2=Integer.parseInt(commandParts[0]);

                fitPassengers(list, number2, maxWagonCapacity);
            }




        }

        writeList(list);
    }
}
