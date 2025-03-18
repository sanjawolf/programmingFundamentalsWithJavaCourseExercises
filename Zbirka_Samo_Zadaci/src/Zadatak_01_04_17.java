import java.util.Scanner;

public class Zadatak_01_04_17 {

    public static int par_nepar(int n){

        String nTekst=n+"";

        int pointer=-1;

        if(nTekst.length()==1) return 1;

        for(int i=0; i<nTekst.length()-1; i++){

            if(!(nTekst.charAt(0)+"").equals("-")){

                int cifra1=Integer.parseInt(nTekst.charAt(i)+"");

                int cifra2=Integer.parseInt(nTekst.charAt(i+1)+"");

                if(cifra1%2==0) {

                    if (cifra2%2 != 0) {

                        pointer = 1;
                    } else {

                        pointer = 0;
                        break;
                    }

                }

                else{

                    if (cifra2%2!= 0) {

                        pointer = 0;
                        break;
                    } else {

                        pointer = 1;
                    }

                }
            }


        }

        for(int i=1; i<nTekst.length()-1; i++){

           if ((nTekst.charAt(0)+"").equals("-")){

               int cifra1=Integer.parseInt(nTekst.charAt(i)+"");

               int cifra2=Integer.parseInt(nTekst.charAt(i+1)+"");

               if(cifra1%2==0) {

                   if (cifra2%2 != 0) {

                       pointer = 1;
                   } else {

                       pointer = 0;
                       break;
                   }

               }

               else{

                   if (cifra2%2!= 0) {

                       pointer = 0;
                       break;
                   } else {

                       pointer = 1;
                   }

               }
           }


        }

        if(pointer==1) return 1;
        else return 0;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        int parNepar=par_nepar(n);

        if(parNepar==1) System.out.println("Broj ispunjava uslov.");
        else System.out.println("Broj ne ispunjava uslov.");
    }
}
