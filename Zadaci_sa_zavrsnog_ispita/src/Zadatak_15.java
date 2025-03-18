import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_15 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int capacity=Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, int[]> sentReceived=new LinkedHashMap<>();

        ArrayList<String> list=new ArrayList<>();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Statistics")) break;

            String [] commandParts=command.split("=");

            String firstPart=commandParts[0];

            if(firstPart.equals("Add")){

                String username=commandParts[1];

                int sent= Integer.parseInt(commandParts[2]);

                int received= Integer.parseInt(commandParts[3]);

                if(!sentReceived.containsKey(username)){

                    sentReceived.put(username, new int[]{sent, received});
                    list.add(username);
                }
            }

            if(firstPart.equals("Message")){

                String sender=commandParts[1];

                String receiver=commandParts[2];

                if(!sentReceived.containsKey(sender)){

                    sentReceived.put(sender, new int[]{0, 0});

                } else if (!sentReceived.containsKey(receiver)) {

                    sentReceived.put(sender, new int[]{0, 0});

                } else{

                    int currentSentSender=sentReceived.get(sender)[0];
                    int currentReceivedSender=sentReceived.get(sender)[1];
                    sentReceived.put(sender, new int[]{currentSentSender+1, currentReceivedSender});
                    int currentReceivedReceiver=sentReceived.get(receiver)[1];
                    int currentSentReceiver=sentReceived.get(receiver)[0];
                    sentReceived.put(receiver, new int[]{currentSentReceiver, currentReceivedReceiver+1});

                    int additionSender=sentReceived.get(sender)[0]+sentReceived.get(sender)[1];
                    int additionReceiver=sentReceived.get(receiver)[1]+sentReceived.get(receiver)[0];

                    if(additionSender>=capacity){

                        sentReceived.remove(sender);
                        System.out.printf("%s reached the capacity!\n", sender);
                    }
                    if(additionReceiver>=capacity){

                        sentReceived.remove(receiver);
                        System.out.printf("%s reached the capacity!\n", receiver);
                    }

                }

            }

            if(firstPart.equals("Empty")){

                String username=commandParts[1];

                if(sentReceived.containsKey(username)) sentReceived.remove(username);

                if(username.equals("All")){

                    for(String s: list){

                        sentReceived.remove(s);
                    }
                }


            }
        }

        System.out.printf("Users count: %d\n", sentReceived.size());

        for(Map.Entry<String, int[]> entry: sentReceived.entrySet()){

            String username= entry.getKey();
            int sent=entry.getValue()[0];
            int received=entry.getValue()[1];

            System.out.printf("%s - %d\n", username, sent+received);
        }
    }
}
