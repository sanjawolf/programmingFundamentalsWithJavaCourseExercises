import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_05_Exercise_01 {

    public static void write(LinkedHashMap<String , Integer> letterNumber){

        for(Map.Entry<String, Integer> entry: letterNumber.entrySet()){

            String letter= entry.getKey();
            int number= entry.getValue();

            System.out.printf("%s -> %s\n", letter, number);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(" ");

        LinkedHashMap<String, Integer> letterNumber=new LinkedHashMap<>();

        for(String s: parts){

            for(int i=0; i<s.length(); i++){

                if(!letterNumber.containsKey(s.charAt(i)+"")){

                    letterNumber.put(s.charAt(i)+"", 1);
                }

                else{

                    int currentNumber= letterNumber.get(s.charAt(i)+"");
                    letterNumber.put(s.charAt(i)+"", currentNumber+1);
                }
            }






        }

        write(letterNumber);
    }
}
