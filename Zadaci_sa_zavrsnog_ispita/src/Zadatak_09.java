import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_09 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> bandMembers=new LinkedHashMap<>();
        LinkedHashMap<String, Integer> bandTime=new LinkedHashMap<>();

        int sum=0;

        String band="";

        while(true){

            String command=sc.nextLine();

            if(command.equals("Start!")) break;

            String [] parts=command.split("; ");

            String firstPart=parts[0];

            band=parts[1];

            if(firstPart.equals("Add")){

                String [] membersParts=parts[2].split(", ");

                if(!bandMembers.containsKey(band)){

                    bandMembers.put(band, new ArrayList<>());
                }

                for(int i=0; i< membersParts.length; i++){

                    if(!bandMembers.get(band).contains(membersParts[i])) bandMembers.get(band).add(membersParts[i]);
                }

            }

            if(firstPart.equals("Play")){

                int time=Integer.parseInt(parts[2]);

                if(!bandTime.containsKey(band)){

                    bandTime.put(band, time);
                }

                else{

                    int currentTime=bandTime.get(band);
                    bandTime.put(band, time+currentTime);
                }

                sum+=time;
            }
        }

        System.out.printf("Total time: %d\n", sum);

        for(Map.Entry<String, Integer> entry: bandTime.entrySet()){

            band= entry.getKey();
            int time= entry.getValue();

            System.out.printf("%s -> %d\n", band, time);
        }

        for(Map.Entry<String, Integer> entry: bandTime.entrySet()){

            band= entry.getKey();
            System.out.printf("%s\n", band);
            ArrayList<String> times=bandMembers.get(band);
            for(String s: times) System.out.printf("=> %s\n", s);
            break;
        }


    }
}
