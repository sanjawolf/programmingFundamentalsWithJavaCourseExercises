import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_01_Lists_Lab_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String list=sc.nextLine();

        String [] parts=list.split(" ");

        ArrayList<Double> numbers=new ArrayList<>();

        for(int i=0; i<parts.length; i++){

            double number=Double.parseDouble(parts[i]);
            numbers.add(number);
        }

        for(int i=0; i<numbers.size()-1; i++){

            double current=numbers.get(i);

            double next=numbers.get(i+1);

            if(current==next){

                numbers.set(i, current+next);

                numbers.remove(i+1);

                i-=2;

                if(i<-1) i=-1;
            }
        }

        DecimalFormat df=new DecimalFormat("#.##");

        for(int j=0; j<numbers.size(); j++){

            System.out.print(df.format(numbers.get(j))+" ");
        }
    }
}
