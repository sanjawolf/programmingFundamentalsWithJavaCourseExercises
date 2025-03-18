import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fancy_Barcodes_Problem {

    public static String filterProductGroup(String s){

        StringBuilder sb=new StringBuilder();

        for(int i=0; i<s.length(); i++){

            char character=s.charAt(i);

            if(Character.isDigit(character)){

                sb.append(character);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        Pattern regex=Pattern.compile("@#+(?<barcode>[A-Z][a-z0-9A-Z]{4,}[A-Z])@#+");

        for(int i=1; i<=n; i++){

            String input=sc.nextLine();

            Matcher matcher= regex.matcher(input);

            if(matcher.find()){

                String barcode= matcher.group("barcode");

                if(barcode.contains("0") || barcode.contains("1") || barcode.contains("2") || barcode.contains("3") || barcode.contains("4") || barcode.contains("5") || barcode.contains("6") || barcode.contains("7") || barcode.contains("8") || barcode.contains("9")){

                    String productGroup=filterProductGroup(barcode);

                    System.out.printf("Product group: %s\n", productGroup);
                }

                else{

                    System.out.println("Product group: 00");
                }
            }

            else{

                System.out.println("Invalid barcode");
            }


        }
    }
}
