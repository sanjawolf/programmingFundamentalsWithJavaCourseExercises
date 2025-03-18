import java.util.Scanner;

public class Zadatak_01_03_25 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj: ");

        int number=Integer.parseInt(sc.nextLine());

        String text=number+"";

        StringBuilder sb1=new StringBuilder();

        for(int i=text.length()-1; i>=0; i--){

            String digit=text.charAt(i)+"";

            sb1.append(digit);
        }

        StringBuilder sb2=new StringBuilder();

        for(int i=0; i<=text.length()-1; i++){

            if(i%2==0){

                sb2.append(sb1.charAt(i)+"");
            }
        }

        System.out.printf("Rezultat: %s", sb2.reverse());
    }
}
