import java.util.*;

public class Zadatak_11_Exercise_08 {

    public static void print(LinkedHashMap<String, ArrayList<String>> keyValuePairs){

        for(Map.Entry<String,ArrayList<String>> entry: keyValuePairs.entrySet()){

            ArrayList<String> list= entry.getValue();

            System.out.printf("%s\n", entry.getKey());

            for(String s: list){

                System.out.printf("-- %s\n", s);
            }

        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> companyEmployeeID=new LinkedHashMap<>();

        while(true){

            String text=sc.nextLine();

            if(text.equals("End")) break;

            String [] parts=text.split(" -> ");

            if(!companyEmployeeID.containsKey(parts[0])){

                companyEmployeeID.put(parts[0], new ArrayList<>());
            }

           if(!companyEmployeeID.get(parts[0]).contains(parts[1])){

               companyEmployeeID.get(parts[0]).add(parts[1]);
                    }







        }

        print(companyEmployeeID);
    }
}
