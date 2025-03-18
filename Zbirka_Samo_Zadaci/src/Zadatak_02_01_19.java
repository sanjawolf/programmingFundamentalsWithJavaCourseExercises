import java.util.Scanner;

public class Zadatak_02_01_19 {


/*???????????????????????????????????????????????????????????????????????????????????*/
    public static int neopadajuce(int [] niz){
        
        int n=niz.length;
        
        for(int i=1; i<n; i++){

            for(int j=0; j<i; j++){

                if(niz[j]<=niz[i]) {

                    return 1;

                }



            }


        }
        
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite dimenziju niza: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0 || n>300) System.out.println("Greska: neispravan unos.");

        else{

            System.out.print("Unesite elemente niza: ");

            String tekst=sc.nextLine();

            String [] elementi=tekst.split(" ");

            int [] niz=new int[n];

            for(int i=0; i<n; i++){

                niz[i]=Integer.parseInt(elementi[i]);
            }

            if(neopadajuce(niz)==1) System.out.println("Niz jeste uredjen neopadajuce.");
            else System.out.println("Niz nije uredjen neopadajuce.");
        }
        
    }
}
