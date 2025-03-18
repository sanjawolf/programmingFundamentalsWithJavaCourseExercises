import java.util.Scanner;

public class Zadatak_06_Judge_Lab_06_preko_kontraprimera {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String prviNizTekst=sc.nextLine();
        String drugiNizTekst=sc.nextLine();

        String[] deloviPrvogNiza=prviNizTekst.split(" ");
        String[] deloviDrugogNiza=drugiNizTekst.split(" ");

        int n1=deloviPrvogNiza.length;
        int n2=deloviDrugogNiza.length;

        if(n1!=n2){

            System.out.println("Arrays are not identical.");
        }

        else{

            int[] prviNiz=new int[n1];
            int[] drugiNiz=new int[n2];

            for(int i=0; i<n1; i++){

                prviNiz[i]=Integer.parseInt(deloviPrvogNiza[i]);
            }

            for(int i=0; i<n1; i++){

                drugiNiz[i]=Integer.parseInt(deloviDrugogNiza[i]);
            }

            int indexOfDifference=-1;
            boolean areIdentical=true;
            int sum=0;

            for(int i=0; i<n1; i++){

                if(prviNiz[i]!=drugiNiz[i]){

                    areIdentical=false;
                    indexOfDifference=i;
                    break;
                }

                sum+=prviNiz[i];

            }

            if(areIdentical){

                System.out.printf("Arrays are identical. Sum: %d", sum);
            }
            else{


                System.out.printf("Arrays are not identical. Found difference at %d index.", indexOfDifference);
            }

        }
    }

}
