import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_21_Judge_Exercise_10 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, Integer> userPoints=new LinkedHashMap<>();
        LinkedHashMap<String, Integer> languageMembers=new LinkedHashMap<>();

        while(true){

            String text=sc.nextLine();

            if(text.equals("exam finished")) break;

            String [] parts=text.split("-");
            String user=parts[0];

            if(parts[1].equals("banned")){

                userPoints.remove(user);
            }

            else{

                String language=parts[1];
                int points=Integer.parseInt(parts[2]);

                if(!userPoints.containsKey(user)){

                    userPoints.put(user, 0);
                    int currentPoints=userPoints.get(user);
                    userPoints.put(user, currentPoints+points);
                }

                else{

                    int currentPoints=userPoints.get(user);

                    if(currentPoints>points){

                        userPoints.put(user, currentPoints);
                    }

                    else{

                        userPoints.put(user, points);
                    }

                }

                if(!languageMembers.containsKey(language)){

                    languageMembers.put(language, 0);
                }

                int currentMembers=languageMembers.get(language);
                languageMembers.put(language, currentMembers+1);
            }

        }

        System.out.println("Results:");

        for(Map.Entry<String , Integer> entry: userPoints.entrySet()){

            System.out.printf("%s | %d\n", entry.getKey(), entry.getValue());
        }

        System.out.println("Submissions:");

        for(Map.Entry<String , Integer> entry: languageMembers.entrySet()){

            System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
        }
    }
}
