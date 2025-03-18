import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_15_Judge_Exercise_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, String> licensePlateNumbers=new LinkedHashMap<>();

        for(int i=1; i<=n; i++){

            String command=sc.nextLine();

            String [] parts=command.split(" ");

            String name=parts[1];

            if(parts[0].equals("register")){

                String licensePlateNumber=parts[2];

                if(!licensePlateNumbers.containsKey(name)){

                    licensePlateNumbers.put(name, licensePlateNumber);
                    System.out.printf("%s registered %s successfully\n", name, licensePlateNumber);
                }

                else{

                    System.out.printf("ERROR: already registered with plate number %s\n", licensePlateNumber);

                }
            }

            else{

                    if(!licensePlateNumbers.containsKey(name)){

                        System.out.printf("ERROR: user %s not found\n", name);
                    }

                    else{

                        licensePlateNumbers.remove(name);
                        System.out.printf("%s unregistered successfully\n", name);
                    }
            }
        }

        for(Map.Entry<String, String> entry: licensePlateNumbers.entrySet()){

            System.out.printf("%s => %s\n", entry.getKey(), entry.getValue());
        }
    }
}
