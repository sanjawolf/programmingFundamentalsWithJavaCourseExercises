import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_17_Lists_Exercise_09 {

    public static void changeList(ArrayList<Integer>list, int removedElement){

        for(int i=0; i< list.size(); i++){

            int element=list.get(i);

            if(element<=removedElement){

                element+=removedElement;
                list.set(i, element);
            }
            else{

                element-=removedElement;
                list.set(i, element);
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(" ");

        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0; i< parts.length; i++){

            list.add(Integer.parseInt(parts[i]));
        }

        int sum=0;

        while(list.size()!=0){

            int index=Integer.parseInt(sc.nextLine());

            if(index<0){

                int setElement= list.get(0);
                int lastElement=list.get(list.size()-1);
                list.set(0, lastElement);
                sum+=setElement;
                changeList(list, setElement);

            }

            else if(index> list.size()-1){

                int setElement= list.get(list.size()-1);
                int firstElement=list.get(0);
                list.set(list.size()-1, firstElement);
                sum+=setElement;
                changeList(list, setElement);
            }

            else{


                int removedElement=list.get(index);
                list.remove(index);
                changeList(list, removedElement);
                sum+=removedElement;
            }




//            for(int element: list){
//
//                System.out.printf("%d ", element);
//            }
//
//            System.out.println();


        }

        System.out.println(sum);
    }
}
