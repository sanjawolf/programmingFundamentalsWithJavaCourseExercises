import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_09_Exercise_05 {

    public static void print(LinkedHashMap<String, ArrayList<String>> keyValuePairs){

        for(Map.Entry<String, ArrayList<String>> entry: keyValuePairs.entrySet()){

            ArrayList<String> list=entry.getValue();

            System.out.printf("%s: %d\n", entry.getKey(), list.size());

            for(String s: list){

                System.out.printf("-- %s\n", s);
            }


        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> courseStudent=new LinkedHashMap<>();

        while(true){

            String courseStudentName=sc.nextLine();

            if(courseStudentName.equals("end")) break;

            String [] parts=courseStudentName.split(" : ");

            if(!courseStudent.containsKey(parts[0])){

                courseStudent.put(parts[0], new ArrayList<>());
            }

                courseStudent.get(parts[0]).add(parts[1]);


        }

        print(courseStudent);
    }
}
