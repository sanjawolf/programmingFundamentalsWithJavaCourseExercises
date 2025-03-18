import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_16_Judge_Exercise_05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> numberOfParticipants = new LinkedHashMap<>();

        while (true) {

            String courseInformation = sc.nextLine();

            if(courseInformation.equals("end")) break;

            String[] parts = courseInformation.split(" : ");

            String course = parts[0];
            String studentsName = parts[1];

            if(!numberOfParticipants.containsKey(course)){

                numberOfParticipants.put(course, new ArrayList<>());
            }

            if(!numberOfParticipants.get(course).contains(studentsName)){

                numberOfParticipants.get(course).add(studentsName);
            }

        }

        for(Map.Entry<String, ArrayList<String >> entry: numberOfParticipants.entrySet()){

            String chosenCourse=entry.getKey();
            ArrayList<String> students=entry.getValue();

            System.out.printf("%s: %d\n", chosenCourse, students.size());

            for(String s: students){

                System.out.printf("-- %s\n", s);
            }
        }

    }
}


