import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_03_Lists_Lab_03 {

    public static void addElements(ArrayList<Integer> list, String text){

        String [] parts=text.split(" ");

        for(int i=0; i<parts.length; i++){

            list.add(Integer.parseInt(parts[i]));
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String first=sc.nextLine();

        String second=sc.nextLine();

        ArrayList<Integer> list1=new ArrayList<>();

        addElements(list1, first);

        ArrayList<Integer> list2=new ArrayList<>();

        addElements(list2, second);

        int greaterLength, lessLength;

        if (list1.size()>list2.size()){

            greaterLength=list1.size();
            lessLength=list2.size();
        }

        else{

            greaterLength=list2.size();
            lessLength=list1.size();
        }

        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0; i<lessLength;i++){

            list.add(list1.get(i));
            list.add(list2.get(i));

        }

        if(greaterLength==list1.size()){

            for(int i=lessLength; i<list1.size(); i++){

                list.add(list1.get(i));
            }
        }

        else{

            for(int i=lessLength; i<list2.size(); i++){

                list.add(list2.get(i));
            }

        }

        for(int element: list){

            System.out.printf("%d ", element);
        }


    }
}
