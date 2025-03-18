import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_14 {

//    public static StringBuilder isDigit(String string){
//
//
//    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        Pattern regex=Pattern.compile("@#+(?<digits>[A-Z][a-zA-Z0-9]{4,}[A-Z])@#+");

        for (int i=0; i<=n; i++){

            String barcode=sc.nextLine();

            Matcher matcher= regex.matcher(barcode);

            if(matcher.find()){

                String digits= matcher.group("digits");

                StringBuilder sb=new StringBuilder();

                for(int j=0; j<digits.length(); j++){

                    if(Character.isDigit(digits.charAt(j))) {

                        sb.append(digits.charAt(j));

                    }
                }

                if(!(digits.contains("0") || digits.contains("1") || digits.contains("2") || digits.contains("3") || digits.contains("4") || digits.contains("5") || digits.contains("6") || digits.contains("7") || digits.contains("8") || digits.contains("9"))) sb.append("00");

                System.out.printf("Product group: %s\n", sb.toString());
            }

            else{

                System.out.println("Invalid barcode");
            }
        }
    }
}
