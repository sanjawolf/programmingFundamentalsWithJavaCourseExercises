import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_13_Exercise_10 {

    public static void printPoints(LinkedHashMap<String, Integer> keyValuePairs){

        for(Map.Entry<String, Integer> entry: keyValuePairs.entrySet()){

            System.out.printf("%s | %d\n", entry.getKey(), entry.getValue());
        }
    }

    public static void printStatistics(LinkedHashMap<String, Integer> keyValuePairs){

        for(Map.Entry<String, Integer> entry: keyValuePairs.entrySet()){

            System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, Integer> usernamePoints=new LinkedHashMap<>();

        LinkedHashMap<String, Integer> languageStatistics=new LinkedHashMap<>();

        while(true){

            String text=sc.nextLine();

            if(text.equals("exam finished")) break;

            String [] parts= text.split("-");

            String username=parts[0];

            if(parts[1].equals("banned")){

                usernamePoints.remove(username);
            }

            else{

                String language=parts[1];

                int points=Integer.parseInt(parts[2]);

                if(!usernamePoints.containsKey(username)){

                    usernamePoints.put(username, 0);
                }

                if(usernamePoints.get(username)<points){

                    usernamePoints.put(username, points);
                }

                if(!languageStatistics.containsKey(language)){

                    languageStatistics.put(language, 0);
                }

                int currentNumber=languageStatistics.get(language);
                languageStatistics.put(language, currentNumber+1);
            }






        }

        System.out.println("Results:");
        printPoints(usernamePoints);
        System.out.println("Submissions:");
        printStatistics(languageStatistics);

    }
}
