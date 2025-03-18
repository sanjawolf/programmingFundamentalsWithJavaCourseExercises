import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_13_Lists_Exercise_06 {

    public static void readCards(ArrayList<Integer> list, String text){

        String [] parts= text.split(" ");

        for(int i=0; i<parts.length; i++){

            list.add(Integer.parseInt(parts[i]));
        }
    }

    public static void changeCards(ArrayList<Integer> cards1, ArrayList<Integer> cards2){

        for(int i=0; i<cards1.size(); i++){

            int card1=cards1.get(i);

            int card2=cards2.get(i);

            if(card1>card2){

                cards1.remove(i);
                cards1.add(card1);
                cards2.remove(i);
                cards1.add(card2);
            }

            else if(card1==card2){

                cards1.remove(i);
                cards2.remove(i);
            }

            else{

                cards2.remove(i);
                cards2.add(card2);
                cards1.remove(i);
                cards2.add(card1);
            }

            if(cards1.size()==0 || cards2.size()==0) break;

            i--;
        }

    }

    public static int getSum(ArrayList<Integer> list){

        int addition=0;

        for(int element: list){

            addition+=element;
        }

        return addition;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text1=sc.nextLine();

        ArrayList<Integer> cards1=new ArrayList<>();

        readCards(cards1, text1);

        String text2=sc.nextLine();

        ArrayList<Integer> cards2=new ArrayList<>();

        readCards(cards2, text2);

        changeCards(cards1, cards2);

        if(cards1.size()>0){

            int result=getSum(cards1);
            System.out.printf("First player wins! Sum: %d", result);
        }

        else{

            int result=getSum(cards2);
            System.out.printf("Second player wins! Sum: %d", result);
        }

    }
}
