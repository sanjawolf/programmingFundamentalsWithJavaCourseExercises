import java.util.Scanner;

public class Zadatak_06_02_05 {

    /**************???????????????????????????????????????????********************/

    public static int baciZaZbir(int zbir) {
        int brojBacanja = 0; // brojač bacanja dve kocke
        int kocka1; // broj koji je pao na prvoj kocki
        int kocka2; // broj koji je pao na drugoj kocki
        do {
            kocka1 = (int)(Math.random()*6) + 1; // baciti prvu kocku
            kocka2 = (int)(Math.random()*6) + 1; // baciti drugu kocku
            brojBacanja++; // uračunati bacanje
        } while ((kocka1 + kocka2) != zbir);
        return brojBacanja;
    }
    public static double prosekZaZbir(int zbir) {
        final int BROJ_PONAVLJANJA = 100000;
        int ukupnoBacanja = 0; // ukupan broj bacanja za
// dati zbir dve kocke
        for (int i = 0; i < BROJ_PONAVLJANJA; i++) ukupnoBacanja = ukupnoBacanja + baciZaZbir(zbir);
        return (double)ukupnoBacanja/BROJ_PONAVLJANJA;
    }


//    public static int baciZaZbir(int zbir){
//
//        int kocka1=(int)(Math.random()*6)+1;
//
//        int kocka2=(int)(Math.random()*6)+1;
//
//        int sum=1;
//
//        while(kocka1+kocka2==zbir){
//
//            kocka1=(int)(Math.random()*6)+1;
//
//            kocka2=(int)(Math.random()*6)+1;
//
//            sum+=1;
//
//        }
//
//        return sum;
//
//    }
//
//    public static double prosekZaZbir(int zbir){
//
//        int sum1=0;
//
//        for(int i=1; i<=1000; i++){
//
//            int sum=baciZaZbir(zbir);
//
//            sum1+=sum;
//        }
//
//        return (double)sum1/1000;
//    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Zbir dve kocke Prosečan broj bacanja");
        System.out.println("-------------- ---------------------");
        for (int i = 0; i < 13; i++) System.out.printf("%d %.2f\n", i, prosekZaZbir(i));


//        System.out.print("Zbir dve kocke");
//        System.out.println("     Prosecan broj bacanja");
//        System.out.print("--------------");
//        System.out.println("     ---------------------");
//
//        for(int i=2; i<=12; i++){
//
//            System.out.print("      "+i+"       ");
//            System.out.println("         "+prosekZaZbir(i));
//
//        }
    }
}
