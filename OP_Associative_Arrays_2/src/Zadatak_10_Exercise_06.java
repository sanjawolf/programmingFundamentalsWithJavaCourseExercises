import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_10_Exercise_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, ArrayList<Double>> studentGrade=new LinkedHashMap<>();

        for(int i=1; i<=n; i++){

            String name=sc.nextLine();

            double grade= Double.parseDouble(sc.nextLine());

            if(!studentGrade.containsKey(name)){

                studentGrade.put(name, new ArrayList<>());
            }

            ArrayList<Double> currentGrades=studentGrade.get(name);
            currentGrades.add(grade);


        }

        for(Map.Entry<String, ArrayList<Double>> entry: studentGrade.entrySet()){

            String student= entry.getKey();
            ArrayList<Double> grades=entry.getValue();

            double sum=0;

            for(Double d: grades){

                sum+=d;
            }


            double average=sum/grades.size();

            if(average>=4.5) System.out.printf("%s -> %.2f\n", student, average);
        }
    }
}
