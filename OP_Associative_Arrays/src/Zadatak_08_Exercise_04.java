import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_08_Exercise_04 {

    public static void print(LinkedHashMap<String , String> keyValuePairs){

        for(Map.Entry<String, String> entry: keyValuePairs.entrySet()){

            System.out.printf("%s => %s\n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, String> usernameLicensePlateNumber=new LinkedHashMap<>();

        for(int i=1; i<=n; i++){

            String command=sc.nextLine();

            String [] parts=command.split(" ");

            if(parts[0].equals("register")){

                if(!usernameLicensePlateNumber.containsKey(parts[1])){

                    usernameLicensePlateNumber.put(parts[1], parts[2]);

                    System.out.printf("%s registered %s successfully\n", parts[1], parts[2]);
                }

                else{

                    System.out.printf("ERROR: already registered with plate number %s\n", parts[2]);
                }

            }

            if(parts[0].equals("unregister")){

                if(!usernameLicensePlateNumber.containsKey(parts[1])){

                    System.out.printf("ERROR: user %s not found\n", parts[1]);
                }

                else{

                    usernameLicensePlateNumber.remove(parts[1]);
                    System.out.printf("%s unregistered successfully\n", parts[1]);
                }

            }
        }

        print(usernameLicensePlateNumber);
    }
}
