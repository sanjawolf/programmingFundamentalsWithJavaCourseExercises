import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_17_Judge_Exercise_06 {

    public static double getAvg(ArrayList<Double> grades){

        double addition=0;
        int counter=0;

        for(double g: grades){

            addition+=g;
            counter++;
        }

        return addition/counter;

    }

    public static void isGraterThan(String name, ArrayList<Double> grades){

        if(getAvg(grades)>=4.5){

            System.out.printf("%s -> %.2f\n", name, getAvg(grades));
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, ArrayList<Double>> grades=new LinkedHashMap<>();

        for(int i=1; i<=n; i++){

            String name=sc.nextLine();

            double grade=Double.parseDouble(sc.nextLine());

            if(!grades.containsKey((name))){

                grades.put(name, new ArrayList<Double>());
            }

            grades.get(name).add(grade);

        }

//        for(Map.Entry<String, ArrayList<Double>> entry: grades.entrySet()){
//
//            String givenName= entry.getKey();
//            ArrayList<Double> givenGrades=entry.getValue();
//            isGraterThan(givenName, givenGrades);
//
//
//
//        }

        grades.entrySet()
                .stream()
                .filter(entry->getAvg(entry.getValue())>=4.5)
                .forEach(entry->System.out.printf("%s -> %.2f\n", entry.getKey(), getAvg(entry.getValue())));




    }
}
