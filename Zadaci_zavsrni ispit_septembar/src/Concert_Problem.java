import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Concert_Problem {

    public static void print(LinkedHashMap<String, Integer> map, int totalTime){

        System.out.printf("Total time: %d\n", totalTime);

        for(Map.Entry<String,Integer> entry: map.entrySet()){

            String band= entry.getKey();
            int time=entry.getValue();

            System.out.printf("%s -> %d\n", band, time);
        }
    }

    public static void print1(LinkedHashMap<String, ArrayList<String>> map, ArrayList<String> list){

        System.out.printf("%s\n", list.get(0));

        for(String member: map.get(list.get(0))) System.out.printf("=> %s\n", member);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, Integer> bandTime=new LinkedHashMap<>();
        LinkedHashMap<String, ArrayList<String>> bandMember=new LinkedHashMap<>();

        int totalTime=0;

        ArrayList<String> list=new ArrayList<>();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Start!")) break;

            String [] commandParts=command.split("; ");

            String firstPart=commandParts[0];

            if(firstPart.equals("Add")){

                String band=commandParts[1];

                String members=commandParts[2];

                String [] membersParts=members.split(", ");

                if(!bandMember.containsKey(band)){

                    bandMember.put(band, new ArrayList<>());
                }

                for(String member: membersParts){

                    if(!bandMember.get(band).contains(member)){

                        bandMember.get(band).add(member);
                    }
                }


            }

            if(firstPart.equals("Play")){

                String band=commandParts[1];

                int time=Integer.parseInt(commandParts[2]);

                totalTime+=time;

                if(!bandTime.containsKey(band)){

                    bandTime.put(band, time);
                    list.add(band);

                }

                else{

                    int currentTime=bandTime.get(band);
                    bandTime.put(band, currentTime+time);

                }



            }

        }

        print(bandTime, totalTime);
        print1(bandMember, list);

    }
}
