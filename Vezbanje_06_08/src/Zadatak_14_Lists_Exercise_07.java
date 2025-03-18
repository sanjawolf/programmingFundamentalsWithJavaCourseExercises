import java.util.Scanner;

public class Zadatak_14_Lists_Exercise_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split("\\s*\\|\\s*");

//        ArrayList<String> list=new ArrayList<>();
//
//        for(int i=parts.length-1; i>=0; i--){
//
//            list.add(parts[i]);
//
//        }

//        System.out.println(list);

        for(int i=parts.length-1; i>=0; i--){

            String [] partsList=parts[i].strip().split(" ");

            for(String s: partsList){

                if(!s.equals("")) System.out.printf("%s ", s);
            }



//                String wholePart=String.join(" ", partsList);
//
//                whole=whole+wholePart+" ";

        }




    }
}
