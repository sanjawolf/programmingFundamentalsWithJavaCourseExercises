import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_24 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> storeItem=new LinkedHashMap<>();

        ArrayList<String> stores=new ArrayList<>();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Go Shopping")) break;

            String [] commandParts=command.split("->");

            String firstPart=commandParts[0];

            if(firstPart.equals("Add")){

                String store=commandParts[1];

                String items=commandParts[2];

                String [] itemParts=items.split(",");

                boolean contains=true;

                if(!storeItem.containsKey(store)){

                    storeItem.put(store, new ArrayList<>());
                    stores.add(store);
                }

                for(int i=0; i<itemParts.length; i++){

                    for(int j=0; j<stores.size(); j++){

                        if(!storeItem.get(stores.get(j)).contains(itemParts[i])){

                            contains=false;
                        }

                        else{

                            contains=true;
                            break;
                        }
                    }

                    if(!contains){

                        storeItem.get(store).add(itemParts[i]);
                    }


                }

            }

            if(firstPart.equals("Important")){

                String store=commandParts[1];

                String item=commandParts[2];

                boolean containsItem=true;

                if(!storeItem.containsKey(store)){

                    storeItem.put(store, new ArrayList<>());
                    stores.add(store);
                }

                for(int j=0; j<stores.size(); j++){

                    if(!storeItem.get(stores.get(j)).contains(item)){

                        containsItem=false;
                    }

                    else{

                            break;
                    }
                }

                if(!containsItem){

                    storeItem.get(store).add(0, item);
                }

            }

            if(firstPart.equals("Remove")){

                String store=commandParts[1];

                if(storeItem.containsKey(store) && !storeItem.get(store).contains(storeItem.get(store).get(0))) storeItem.remove(store);

            }
        }

        for(Map.Entry<String, ArrayList<String>> entry: storeItem.entrySet()){

            String store= entry.getKey();
            ArrayList<String> items=entry.getValue();

            System.out.printf("%s:\n", store);

            for(String item: items) System.out.printf(" -%s\n", item);
        }
    }
}
