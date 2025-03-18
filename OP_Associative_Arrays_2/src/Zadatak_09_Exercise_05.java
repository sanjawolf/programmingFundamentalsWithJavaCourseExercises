import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_09_Exercise_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> courseStudent=new LinkedHashMap<>();

        while(true){

            String text=sc.nextLine();

            if(text.equals("end")) break;

            String [] parts=text.split(" : ");

            if(!courseStudent.containsKey(parts[0])){

                courseStudent.put(parts[0], new ArrayList<>());
            }

            ArrayList<String> currentStudents=courseStudent.get(parts[0]);
            currentStudents.add(parts[1]);

        }

       for(Map.Entry<String, ArrayList<String>> entry: courseStudent.entrySet()){

           String course= entry.getKey();
           ArrayList<String> list=entry.getValue();

           System.out.printf("%s: %d\n", course, list.size());

           for(String s: list) System.out.printf("-- %s\n", s);
       }
    }
}
