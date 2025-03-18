import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_11_Lists_Exercise_05 {

    public static void readList(ArrayList<Integer> list, String text){

        String [] parts=text.split(" ");

        for(int i=0; i< parts.length; i++){

            list.add(Integer.parseInt(parts[i]));
        }
    }

    public static boolean getElementsUnderScope(ArrayList<Integer> list, int position){

        if(position>=0 && position<=list.size()-1) return true;
        else return false;
    }

    public static void detonate(ArrayList<Integer> list, int position, int scope){

        int deletePosition=position-scope;

        if(deletePosition<0)  deletePosition=0;

        for(int i=position-scope; i<=position+scope; i++)

            if(getElementsUnderScope(list, deletePosition)) list.remove(deletePosition);

    }

    public static int getSum(ArrayList<Integer> list){

        int addition=0;

        for(int element: list){

            addition+=element;
        }

        return addition;
    }

    public static void writeList(ArrayList<Integer> list){

        for(int element: list){

            System.out.printf("%d ", element);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text1=sc.nextLine();

        ArrayList<Integer> list1=new ArrayList<>();

        readList(list1, text1);

        String text2=sc.nextLine();

        ArrayList<Integer> list2=new ArrayList<>();

        readList(list2, text2);

        int specialNumber=list2.get(0);

        int scopeOfDetonation= list2.get(1);

        for(int i=0; i<list1.size(); i++){

            int element=list1.get(i);

            if(element==specialNumber){

                detonate(list1, i, scopeOfDetonation);
                i=-1;

            }

        }

        int result=getSum(list1);
        System.out.println(result);

    }


}
