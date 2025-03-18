import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_20_Judge_Exercise_09 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> sideUser=new LinkedHashMap<>();

        while(true){

            String text=sc.nextLine();

            if(text.equals("Lumpawaroo")) break;

            if(text.contains("|")){

                String[] parts1=text.split(" | ");
                String forceUser1=parts1[2];
                String forceSide1=parts1[0];

                if(!sideUser.containsKey(forceSide1)){

                sideUser.put(forceSide1, new ArrayList<>());
                sideUser.get(forceSide1).add(forceUser1);
                }

            }

            if(text.contains("->")){

                String[] parts2=text.split(" -> ");
                String forceUser1=parts2[0];
                String forceSide1=parts2[1];

                if(!sideUser.containsKey(forceSide1)){

                    sideUser.put(forceSide1, new ArrayList<>());

                }


                sideUser.get(forceSide1).add(forceUser1);
                System.out.printf("%s joins the %s side!\n", forceUser1, forceSide1);



            }
        }

        for(Map.Entry<String, ArrayList<String >> entry: sideUser.entrySet()) {

            ArrayList<String> users = entry.getValue();
            System.out.printf("Side: %s, Members: %d\n", entry.getKey(), users.size());

            for(String s: users){

                System.out.printf("! %s\n", s);

            }
        }
    }
}
