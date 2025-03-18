import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_05_Lists_Lab_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(" ");

        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0; i< parts.length; i++){

            list.add(Integer.parseInt(parts[i]));
        }

        for(int i=0; i<list.size(); i++){

            if(list.get(i)<0){

                list.remove(i);

                i--;
            }


        }

        if(list.size()==0){

            System.out.println("empty");
        }

        Collections.reverse(list);

        for(int element: list){

            System.out.printf("%d ", element);
        }
    }
}
