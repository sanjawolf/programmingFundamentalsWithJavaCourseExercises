import java.util.Scanner;

public class Zadatak_01_03_26 {

    public static void main(String[] args) {

        /*********************??????????????????????????*******************************/

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj: ");

        int number=Integer.parseInt(sc.nextLine());

        StringBuilder sb=new StringBuilder();

        if(number<=0){

            System.out.println("Greska: neispravan unos.");
            return;
        }

        else{

            String text=number+"";

            for(int i=0; i<text.length()-2; i++){

                String char1=text.charAt(i)+"";

                String char2=text.charAt(i+1)+"";

                String char3=text.charAt(i+2)+"";

                int digit1=Integer.parseInt(char1);

                int digit2=Integer.parseInt(char2);

                int digit3=Integer.parseInt(char3);

                if(digit2==digit1+digit3) {

                    sb.append(char1);
                    sb.append(char3);

                }

            }
        }

        System.out.printf("Rezultat: %s", sb);


    }
}
