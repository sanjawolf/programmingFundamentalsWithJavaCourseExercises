import java.util.Scanner;

public class Zadatak_02_01_30 {

    /*???????????????????????????????????????????????????????????????????????????*/

    public static int brisi_proste(int [] a){

        int n=a.length;

        int sum=1;

        for(int i=0; i<n; i++){

            int b=a[i];

            int[] c=new int[sum];

            for(int j=2; j<a[i]; j++){

                if(b%j==0){

                    c[i]=a[i];

                    sum+=1;

                    break;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite dimenziju niza: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0 || n>100) System.out.println("Greska: neispravan unos.");

        else{

            System.out.print("Unesite elemente niza: ");

            String tekst=sc.nextLine();

            String [] elementi=tekst.split(" ");

            int [] niz=new int[n];

            for(int i=0; i<n; i++){

                niz[i]=Integer.parseInt(elementi[i]);
            }

            int [] dobijeniNiz=new int[brisi_proste(niz)];


        }

    }
}
