import java.util.Scanner;

public class Zadatak_01_04_24_b {

    public static void prebrojavanje(String tekst){

        int sumV=0;
        int sumM=0;
        int sumC=0;
        int sumB=0;
        int sum=0;

        for(int i=0; i<tekst.length(); i++){

            char c=tekst.charAt(i);

            if(c>='a' && c<='z'){

                sumM+=1;

            }
            else if(c>='A' && c<='Z'){

                sumV+=1;

            }
            else if(c>='0' && c<='9'){

                sumC+=1;
                sum+=Integer.parseInt(c+"");

            }
            else if(c==' '){

                sumB+=1;

            }

        }


        System.out.printf("Mala slova: %d\n", sumM);
        System.out.printf("Velika slova: %d\n", sumV);
        System.out.printf("Cifre: %d\n", sumC);
        System.out.printf("Suma cifara: %d\n", sum);
        System.out.printf("Beline: %d\n", sumB);

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite tekst: ");

        String tekst=sc.nextLine();

        prebrojavanje(tekst);


    }
}
