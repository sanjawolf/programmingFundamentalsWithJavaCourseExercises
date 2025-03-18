import java.util.Scanner;

public class Zadatak_02_01_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        /*????????????????????????????????????????????????????????????????????????????????????????????*/

        System.out.print("Unesite ceo broj: ");

        int broj=Integer.parseInt(sc.nextLine());

        if(broj>=0){

            String brojTekst=broj+"";

            int [] a=new int[brojTekst.length()];

            a[0]=1;

            for(int i=0; i<brojTekst.length(); i++){

                char karakter1=brojTekst.charAt(i);

                int cifra1=Integer.parseInt(karakter1+"");

                if(i!=0){

                    for(int k=0; k<=i-1; k++){

                        char karakter3=brojTekst.charAt(k);

                        int cifra3=Integer.parseInt(karakter3+"");

                        if(cifra1!=cifra3) {

                            a[i]=1;

                            for (int j = i + 1; j < brojTekst.length(); j++) {

                                char karakter2 = brojTekst.charAt(j);

                                int cifra2 = Integer.parseInt(karakter2 + "");

                                if (cifra1 == cifra2) a[i] += 1;
                            }

                        }

                        else break;
                    }

                }

                else{

                    for(int j=i+1; j<brojTekst.length(); j++) {

                        char karakter2 = brojTekst.charAt(j);

                        int cifra2 = Integer.parseInt(karakter2 + "");

                        if (cifra1 == cifra2) a[i] += 1;

                    }
                }





            }

            for(int el: a) System.out.println(el);
        }
    }
}
