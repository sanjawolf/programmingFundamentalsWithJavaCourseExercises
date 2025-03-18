import java.util.Scanner;

public class Zadatak_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double sizOfSide=Double.parseDouble(sc.nextLine());
        int numberOfPaperSheets=Integer.parseInt(sc.nextLine());

        double giftboxArea=6*sizOfSide*sizOfSide;

        double area=0;

        for(int i=1; i<=numberOfPaperSheets; i++){

            double lengthOfSinglePaperSheet=Double.parseDouble(sc.nextLine());
            double widthOfSinglePaperSheet=Double.parseDouble(sc.nextLine());

            double singlePaperArea=lengthOfSinglePaperSheet*widthOfSinglePaperSheet;

            if(i%3==0){

                singlePaperArea*=0.75;
            }

            if(i%5==0){

                singlePaperArea=0;
            }

                area+=singlePaperArea;

        }

        if(area>=giftboxArea){

            double percentage=(area-giftboxArea)*100/area;
            System.out.println("You've covered the gift box!");
            System.out.printf("%.2f%% wrap paper left.", percentage);
        }

        else{

            double percentage=(giftboxArea-area)*100/giftboxArea;
            System.out.println("You are out of paper!");
            System.out.printf("%.2f%% of the box is not covered.", percentage);
        }


    }
}
