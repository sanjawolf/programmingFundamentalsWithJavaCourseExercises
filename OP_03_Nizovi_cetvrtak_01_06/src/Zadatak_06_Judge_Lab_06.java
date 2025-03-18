import java.util.Scanner;

public class Zadatak_06_Judge_Lab_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String niz1Tekst=sc.nextLine();
        String niz2Tekst=sc.nextLine();

        String niz1[]=niz1Tekst.split(" ");
        String niz2[]=niz2Tekst.split(" ");

        int n=niz1.length;

        int niz1Brojevi[]=new int[n];
        int niz2Brojevi[]=new int[n];

        int sum=0;

        for(int i=0; i<n;i++){

            niz1Brojevi[i]=Integer.parseInt(niz1[i]);
            niz2Brojevi[i]=Integer.parseInt(niz2[i]);

            if(niz1Brojevi[i]==niz2Brojevi[i]){

                sum+=niz1Brojevi[i];
            }

            else{

                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }
        }

        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}
