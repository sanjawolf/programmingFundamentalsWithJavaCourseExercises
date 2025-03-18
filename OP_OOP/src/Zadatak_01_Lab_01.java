import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak_01_Lab_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(" ");

        ArrayList<String> list=new ArrayList<>();

        for(int i=0; i< parts.length; i++){

            list.add(parts[i]);
        }

        int n=list.size();

        Random randIndex=new Random();

        for(int i=0; i<n; i++){

            int rand= randIndex.nextInt(n);
            System.out.printf("%s \n", list.get(rand));
        }
    }
}
