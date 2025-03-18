import java.util.Scanner;

public class Zadatak_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text1=sc.nextLine();

        String [] parts1=text1.split(" ");

        int [] whiteGold=new int[parts1.length];

        for(int i=0; i< parts1.length; i++){

            whiteGold[i]=Integer.parseInt(parts1[i]);
//            System.out.printf("%d ", gold[i]);
        }

//        System.out.println();

        String text2=sc.nextLine();

        String [] parts2=text2.split(" ");

        int [] yellowGold=new int[parts2.length];

        for(int i=0; i< parts2.length; i++){

            yellowGold[i]=Integer.parseInt(parts2[i]);
//            System.out.printf("%d ", gold[i]);
        }

//        System.out.println();

        int pairsOfEarings=0;
        int store=0;

        for(int i=0; i<whiteGold.length; i++){

            while(whiteGold[i]+yellowGold[i]>10){

                    yellowGold[i]-=2;

            }

            if(whiteGold[i]+yellowGold[i]==10){

                pairsOfEarings+=1;
            }

            if(whiteGold[i]+yellowGold[i]<10){

                store+=yellowGold[i]+whiteGold[i];

            }
        }

        if(store>0){

            pairsOfEarings+=store/10;
        }

        if(pairsOfEarings>=7){

            System.out.printf("Great success, you created %d earrings.", pairsOfEarings);

        }

        else{

            System.out.printf("Keep trying, you need %d more earrings.", 7-pairsOfEarings);
        }

    }


}
