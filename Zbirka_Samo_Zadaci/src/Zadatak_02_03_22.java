import java.util.Scanner;

public class Zadatak_02_03_22 {

    /********************************????????????????????????????????????????****************************/
    public static  int strcspn_klon(String t, String s){

        int duzinaPrefiksa=0;

        for(int i=0; i<t.length(); i++){

            char karakter=t.charAt(i);

            for(int j=0; j<s.length(); j++){

                if((s.charAt(j)+"").equals(karakter+"")){

                    duzinaPrefiksa+=1;
                }
            }
        }

        return duzinaPrefiksa;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite nisku t: ");

        String t=sc.nextLine();

        System.out.print("Unesite nisku s: ");

        String s=sc.nextLine();

        if(t.length()<=20 && s.length()<=20){

            System.out.printf("Rezultat: %d", strcspn_klon(t, s));
        }

    }
}
