import java.util.Scanner;

public class Zadatak_01_03_24 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj: ");

        int number=Integer.parseInt(sc.nextLine());

        if(number<=0) System.out.println("Greska: neispravan unos.");

        else{

            String text=number+"";

            StringBuilder sb=new StringBuilder();

            for(int i=0; i<text.length(); i++){

                int digit=Integer.parseInt(text.charAt(i)+"");

                if(digit%2==0){

                    digit+=1;
                }

                sb.append(digit+"");
            }

            System.out.printf("Rezultat: %s", sb.toString());
        }
    }
}
