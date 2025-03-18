import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_19_Judge_Exercise_08 {

    public static void writeIDs(ArrayList<String> ids){

        for(String s: ids){

            System.out.printf("-- %s\n", s);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap <String, ArrayList<String>> usersIDs=new LinkedHashMap<>();

        while(true){

            String nameOfCompanyID=sc.nextLine();

            if(nameOfCompanyID.equals("End")) break;

            String [] parts=nameOfCompanyID.split(" -> ");

            String nameOfCompany=parts[0];

            String id=parts[1];

            if(!usersIDs.containsKey(nameOfCompany)){

                usersIDs.put(nameOfCompany, new ArrayList<String>());

            }


            if(!usersIDs.get(nameOfCompany).contains(id)){

                usersIDs.get(nameOfCompany).add(id);
            }


        }

        for(Map.Entry<String , ArrayList<String >> entry: usersIDs.entrySet()){

            String company=entry.getKey();
            ArrayList<String> ids=entry.getValue();

            System.out.printf("%s\n", company);
            writeIDs(ids);
        }
    }
}
