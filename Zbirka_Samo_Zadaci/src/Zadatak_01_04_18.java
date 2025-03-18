import java.util.Scanner;

public class Zadatak_01_04_18 {

    public static int rotacija(int n){

        String nTekst=n+"";

        StringBuilder izmedju=new StringBuilder();

        if(nTekst.charAt(0)!='-'){

            int [] nizCifara=new int[nTekst.length()];

            for(int i=0; i<nTekst.length(); i++){

                nizCifara[i]=Integer.parseInt(nTekst.charAt(i)+"");
            }

//       char nulti=nTekst.charAt(0);
//
//       char duzinaMinusPrvi=nTekst.charAt(nTekst.length()-1);
//
//       char temp=nulti;
//       nulti=duzinaMinusPrvi;
//       duzinaMinusPrvi=temp;



            int temp=nizCifara[0];
//
//        nizCifara[nizCifara.length-1]=nizCifara[0];

            for(int i=0; i<nTekst.length()-1; i++){

                nizCifara[i]=nizCifara[i+1];

                String cifraTekst=nizCifara[i]+"";

                izmedju.append(cifraTekst);

//            izmedju.append(nTekst.charAt(i));
            }

            izmedju.append(temp);
        }

        else{

            int [] nizCifara=new int[nTekst.length()];

            for(int i=1; i<nTekst.length(); i++){

                nizCifara[i]=Integer.parseInt(nTekst.charAt(i)+"");
            }

//       char nulti=nTekst.charAt(0);
//
//       char duzinaMinusPrvi=nTekst.charAt(nTekst.length()-1);
//
//       char temp=nulti;
//       nulti=duzinaMinusPrvi;
//       duzinaMinusPrvi=temp;



            int temp=nizCifara[1];

            izmedju.append("-");
//
//        nizCifara[nizCifara.length-1]=nizCifara[0];

            for(int i=1; i<nTekst.length()-1; i++){

                nizCifara[i]=nizCifara[i+1];

                String cifraTekst=nizCifara[i]+"";

                izmedju.append(cifraTekst);

//            izmedju.append(nTekst.charAt(i));
            }

            izmedju.append(temp);
        }



//        izmedju.append(duzinaMinusPrvi);



        int rotac=Integer.parseInt(izmedju.toString());

        return rotac;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj: ");

        int n=Integer.parseInt(sc.nextLine());

        while(n!=0){

            int rotiran=rotacija(n);

            System.out.printf("Novi broj: %d\n", rotiran);

            System.out.print("Unesite broj: ");

            n=Integer.parseInt(sc.nextLine());

        }


    }
}
