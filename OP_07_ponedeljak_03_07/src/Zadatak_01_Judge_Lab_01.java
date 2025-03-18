import java.util.*;
import java.util.stream.Collectors;

public class Zadatak_01_Judge_Lab_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String wordsText= sc.nextLine();

        String [] wordsTextParts=wordsText.split(" ");

        ArrayList<String> words= new ArrayList<>();

        for (int i=0; i<wordsTextParts.length; i++){

            words.add(wordsTextParts[i]);
        }

        int n=words.size();

        Random order=new Random();

        for(int i=0; i<n; i++){

            int randomPosition=order.nextInt(n);

            String position=words.get(i);
            String randomIndex=words.get(randomPosition);
            String substitution=position;
            words.set(i, randomIndex);
            words.set(randomPosition, substitution);


            }

        for(String word: words){

            System.out.println(word);
        }

    }
}
