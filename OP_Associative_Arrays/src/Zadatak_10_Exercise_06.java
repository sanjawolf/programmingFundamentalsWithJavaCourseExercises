import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_10_Exercise_06 {

    public static double getAvg(ArrayList<Double> list){

        double sum=0;

        for(Double d: list){

            sum+=d;
        }

        return sum/list.size();
    }

    public static double prosekPrekoStreama(ArrayList<Double> list){

        return list.stream()
                .mapToDouble(e -> e)
                .average()
                .getAsDouble();
    }

    public static void print(LinkedHashMap<String, ArrayList<Double>> keyValuePairs){

        for(Map.Entry<String, ArrayList<Double>> entry: keyValuePairs.entrySet()){

            ArrayList<Double> list=entry.getValue();

            if(prosekPrekoStreama(list)>=4.5){

                System.out.printf("%s -> %.2f\n", entry.getKey(), prosekPrekoStreama(list));
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, ArrayList<Double>> nameGrade=new LinkedHashMap<>();

        for(int i=1; i<=n; i++){

            String name=sc.nextLine();

            double grade=Double.parseDouble(sc.nextLine());

            if(!nameGrade.containsKey(name)){

                nameGrade.put(name, new ArrayList<>());
            }

            nameGrade.get(name).add(grade);
        }

        print(nameGrade);
    }
}
