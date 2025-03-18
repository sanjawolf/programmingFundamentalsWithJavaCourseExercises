import java.util.Scanner;

public class Zadatak_01_Judge_Lab_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int broj=Integer.parseInt(sc.nextLine());

        int binarnaCifra=Integer.parseInt(sc.nextLine());

        int brojac=0;

        while(broj!=0){

            int poslednjaCifra=broj%2;

            broj=broj/2;

            if(poslednjaCifra==binarnaCifra){

                brojac++;
            }
        }

        System.out.println(brojac);
    }
}
