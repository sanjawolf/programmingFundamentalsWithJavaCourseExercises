import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_12_Exercise_10 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> nameLanguage=new LinkedHashMap<>();

        LinkedHashMap<String, Integer> namePoints=new LinkedHashMap<>();

        while(true){

            String text=sc.nextLine();

            String [] parts=text.split("-");

            if(text.equals("exam finished")) break;

            if(parts[1].equals("banned")) namePoints.remove(parts[0]);

            else{

                if(!nameLanguage.containsKey(parts[1])){

                    nameLanguage.put(parts[1], new ArrayList<>());
                }

                nameLanguage.get(parts[1]).add(parts[0]);

                int points=Integer.parseInt(parts[2]);

                if(!namePoints.containsKey(parts[0])){

                    namePoints.put(parts[0], points);
                }

                else{

                    if(namePoints.get(parts[0])<points) namePoints.put(parts[0], points);
                }
            }


        }

        System.out.println("Results:");

        for(Map.Entry<String, Integer> entry: namePoints.entrySet()){

            String name= entry.getKey();
            int points=entry.getValue();

            System.out.printf("%s | %d\n", name, points);
        }

        System.out.println("Submissions:");

        for(Map.Entry<String, ArrayList<String>> entry: nameLanguage.entrySet()){

            String language= entry.getKey();
            ArrayList<String> submissions=entry.getValue();

            System.out.printf("%s - %d\n",language, submissions.size());
            }
        }
    }

