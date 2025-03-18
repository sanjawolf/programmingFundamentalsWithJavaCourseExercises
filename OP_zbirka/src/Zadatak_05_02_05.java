import java.util.Scanner;

public class Zadatak_05_02_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

//        int brojBacanja = 0; // brojač bacanja dve kocke
//        int kocka1; // broj koji je pao na prvoj kocki
//        int kocka2; // broj koji je pao na drugoj kocki
//        do {
//            kocka1 = (int)(Math.random()*6) + 1; // baci prvu kocku
//            kocka2 = (int)(Math.random()*6) + 1; // baci drugu kocku
//            brojBacanja++; // uračunati bacanje
//            System.out.printf(
//                    "%d. bacanje: kocka1 = %d, kocka2 = %d\n",
//                    brojBacanja, kocka1, kocka2);
//        } while ((kocka1 != 1) || (kocka2 != 1));

        int brojBacanja=0;

        while(true){

            int ishodBacanja1=(int)(Math.random()*6+1);

            int ishodBacanja2=(int)(Math.random()*6+1);

            System.out.printf("Vrednost prve kocke: %d\n", ishodBacanja1);

            System.out.printf("Vrednost druge kocke: %d\n", ishodBacanja2);

            brojBacanja+=1;

            if(ishodBacanja1==1 && ishodBacanja2==1) break;


        }

        System.out.printf("Ukupan broj bacanja kocki: %d", brojBacanja);
    }
}
