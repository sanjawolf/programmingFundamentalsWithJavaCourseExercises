import java.util.Scanner;

public class Zadatak_02_Judge_Exercise_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String prviNizTekst=sc.nextLine();
        String drugiNizTekst=sc.nextLine();

        String prviNizDelovi []=prviNizTekst.split(" ");
        String drugiNizDelovi []=drugiNizTekst.split(" ");

        int n1=prviNizDelovi.length;
        int n2=drugiNizDelovi.length;

        for(int j=0; j<n2; j++){

            boolean hasEquals=false;

            for(int i=0; i<n1; i++){

                if(drugiNizDelovi[j].equals(prviNizDelovi[i])){

                    hasEquals=true;
                    break;
                }
            }

            if(hasEquals){

                System.out.print(drugiNizDelovi[j]+" ");
            }
        }

//        for(int j=0; j<n2; j++){
//
//            for(int i=0; i<n1; i++){
//
//                if(prviNizDelovi[i].equals(drugiNizDelovi[j])){
//
//                    System.out.print(prviNizDelovi[i]+" ");
//                }
//            }
//        }
    }
}
