import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_05_Exercise_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(", ");

        ArrayList<String> list=new ArrayList<>();

        for(String part: parts){

            list.add(part);
        }

        LinkedHashMap<String, Integer> namesKilometers=new LinkedHashMap<>();

        for(String s: list){

            namesKilometers.put(s, 0);
        }

        Pattern pattern1=Pattern.compile("[A-Za-z]");

        Pattern pattern2=Pattern.compile("[0-9]");

        while(true){

            String alphanumeric=sc.nextLine();

            if(alphanumeric.equals("end of race")) break;

            StringBuilder name=new StringBuilder();

            Matcher matcher1=pattern1.matcher(alphanumeric);

            while(matcher1.find()){

                String character=matcher1.group();

                    name.append(character);
                }

            Matcher matcher2=pattern2.matcher(alphanumeric);

            while(matcher2.find()){

                String number=matcher2.group();

                if(namesKilometers.containsKey(name.toString())){

                    int currentKilometers=namesKilometers.get(name.toString());

                    namesKilometers.put(name.toString(), currentKilometers+Integer.parseInt(number));
                }

            }


        }

//        for(Map.Entry<String, Integer> map: namesKilometers.entrySet()){
//
//            System.out.printf("%s %d\n", map.getKey(), map.getValue());
//        }

        List<String> sortedPlaces=namesKilometers.entrySet()
                .stream()
                .sorted((a,b) -> Integer.compare(b.getValue(), a.getValue()))
                .map(Map.Entry::getKey)
                .toList();

        System.out.printf("1st place: %s\n", sortedPlaces.get(0));
        System.out.printf("2nd place: %s\n", sortedPlaces.get(1));
        System.out.printf("3rd place: %s", sortedPlaces.get(2));
    }
}
