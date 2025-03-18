import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Shopping_Problem {

    public static void print(LinkedHashMap<String, ArrayList<String>> map){

        for(Map.Entry<String, ArrayList<String>> entry: map.entrySet()){

            String store= entry.getKey();
            ArrayList<String> items=entry.getValue();

            System.out.printf("%s:\n", store);
            for(String item: items) System.out.printf(" - %s\n", item);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> storeItems=new LinkedHashMap<>();

        ArrayList<String> list=new ArrayList<>();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Go Shopping")) break;

            String [] commandParts=command.split("->");

            String firstPart=commandParts[0];

            if(firstPart.equals("Add")){

                String store=commandParts[1];

                String items=commandParts[2];

                String [] parts=items.split(",");

                boolean contains=true;

                if(!storeItems.containsKey(store)){

                    storeItems.put(store, new ArrayList<>());
                    list.add(store);
                }

                for(int j=0; j<parts.length; j++){

                    for(int i=0; i<list.size(); i++){

                        if(!storeItems.get(list.get(i)).contains(parts[j])){

                            contains=false;
                        }

                        else{

                            contains=true;
                            break;
                        }

                    }

                    if(!contains) storeItems.get(store).add(parts[j]);
                }


            }

            if(firstPart.equals("Important")){

                String store=commandParts[1];

                String item=commandParts[2];

                boolean containsItem=true;

                if(!storeItems.containsKey(store)){

                    storeItems.put(store, new ArrayList<>());
                    list.add(store);
                }

                for(int i=0; i<list.size(); i++){

                    if(!storeItems.get(list.get(i)).contains(item)){

                        containsItem=false;
                    }

                    else break;

                }

                if(!containsItem) storeItems.get(store).add(0, item);
            }

            if(firstPart.equals("Remove")){

                String store=commandParts[1];

                if(storeItems.containsKey(store) && !storeItems.get(store).contains(storeItems.get(store).get(0))) storeItems.remove(store);
            }
        }

        print(storeItems);

    }
}
