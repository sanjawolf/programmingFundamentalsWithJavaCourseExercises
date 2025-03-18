import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Messages_Manager_Problem {

    public static LinkedHashMap<String, int[]> remove(ArrayList<String> list, LinkedHashMap<String , int[]> map){

        for(String s: list) map.remove(s);

        return map;
    }

    public static void print(LinkedHashMap<String, int[]> map){

        System.out.printf("Users count: %d\n", map.size());

        for(Map.Entry<String, int[]> entry: map.entrySet()){

            String username= entry.getKey();
            int sent=entry.getValue()[0];
            int received=entry.getValue()[1];

            System.out.printf("%s - %d\n", username, sent+received);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, int[]> usernameNumberOfMessages=new LinkedHashMap<>();

        int capacity=Integer.parseInt(sc.nextLine());

        ArrayList<String> list=new ArrayList<>();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Statistics")) break;

            String [] commandParts=command.split("=");

            String firstPart=commandParts[0];

            if(firstPart.equals("Add")){

                String username=commandParts[1];

                int sent=Integer.parseInt(commandParts[2]);

                int received=Integer.parseInt(commandParts[3]);


                if(!usernameNumberOfMessages.containsKey(username)){

                    usernameNumberOfMessages.put(username, new int[]{sent, received});
                    list.add(username);
                }

            }

            if(firstPart.equals("Message")){

                String sender=commandParts[1];

                String receiver=commandParts[2];

                if(usernameNumberOfMessages.containsKey(sender)){

                    int currentSentSender=usernameNumberOfMessages.get(sender)[0];
                    int currentReceivedSender=usernameNumberOfMessages.get(sender)[1];

                    usernameNumberOfMessages.put(sender, new int[]{currentSentSender+1, currentReceivedSender});
                }

                if(usernameNumberOfMessages.containsKey(receiver)){

                    int currentSentReceiver=usernameNumberOfMessages.get(receiver)[0];
                    int currentReceivedReceiver=usernameNumberOfMessages.get(receiver)[1];

                    usernameNumberOfMessages.put(receiver, new int[]{currentSentReceiver, currentReceivedReceiver+1});
                }

                if(usernameNumberOfMessages.get(sender)[0]+usernameNumberOfMessages.get(sender)[1]>=capacity){

                    usernameNumberOfMessages.remove(sender);
                    System.out.printf("%s reached the capacity!\n", sender);
                }

                if(usernameNumberOfMessages.get(receiver)[0]+usernameNumberOfMessages.get(receiver)[1]>=capacity){

                    usernameNumberOfMessages.remove(receiver);
                    System.out.printf("%s reached the capacity!\n", receiver);
                }
            }

            if(firstPart.equals("Empty")){

                String username=commandParts[1];

                if(usernameNumberOfMessages.containsKey(username)){

                    usernameNumberOfMessages.remove(username);


                }

                if(username.equals("All")){

                    usernameNumberOfMessages=remove(list, usernameNumberOfMessages);

                }
            }
        }

        print(usernameNumberOfMessages);
    }
}
