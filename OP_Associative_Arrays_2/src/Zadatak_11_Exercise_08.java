import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_11_Exercise_08 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> companyNamesEmployeeIDs=new LinkedHashMap<>();

        while(true){

            String text=sc.nextLine();

            String [] parts=text.split(" -> ");

            if(text.equals("End")) break;

            if(!companyNamesEmployeeIDs.containsKey(parts[0])){

                companyNamesEmployeeIDs.put(parts[0], new ArrayList<>());
            }

            ArrayList<String> currentEmployeeIDs=companyNamesEmployeeIDs.get(parts[0]);

            if(!currentEmployeeIDs.contains(parts[1])){

                currentEmployeeIDs.add(parts[1]);
            }




        }

        for(Map.Entry<String , ArrayList<String>> entry: companyNamesEmployeeIDs.entrySet()){

            String companyName= entry.getKey();
            ArrayList<String> employeeID=entry.getValue();

            System.out.printf("%s\n", companyName);
            for(String s: employeeID) System.out.printf("-- %s\n", s);
        }
    }
}
