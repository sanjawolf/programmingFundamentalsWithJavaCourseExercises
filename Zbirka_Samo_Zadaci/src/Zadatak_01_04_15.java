import java.util.Scanner;

public class Zadatak_01_04_15 {

    public static int zapis(int x, int y){

        String xTekst=x+"";
        String yTekst=y+"";

        int sum=0;

        for(int i=0; i<xTekst.length(); i++){

            String characterX=xTekst.charAt(i)+"";

            for(int j=0; j<yTekst.length(); j++){

                String characterY=yTekst.charAt(j)+"";

                if(characterX.equals(characterY) && !characterX.equals("-") && !characterY.equals("-")){

                    sum+=1;
                    yTekst=yTekst.replace(characterY, "");
                    break;
                }
            }

        }

        if(sum==xTekst.length()) return 1;
        else return 0;


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite dva broja: ");

        String tekst=sc.nextLine();

        String [] brojevi=tekst.split(" ");

        int x=Integer.parseInt(brojevi[0]);

        int y=Integer.parseInt(brojevi[1]);

        int zapis=zapis(x, y);

        if(zapis==1) System.out.println("Uslov je ispunjen.");
        else System.out.println("Uslov nije ispunjen.");
    }
}
