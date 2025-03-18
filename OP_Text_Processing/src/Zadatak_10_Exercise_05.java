import java.util.Scanner;

public class Zadatak_10_Exercise_05 {

    public static String multiply(String bigNumberText, String numberText){

        int number=Integer.parseInt(numberText);

        if(number==0) return "0";

        int n=bigNumberText.length();

        StringBuilder sb=new StringBuilder();

        int transmit=0;

        for(int i=n-1; i>=0; i--){

            int bigNumberDigit=Integer.parseInt(bigNumberText.charAt(i)+"");

            int res=number*bigNumberDigit+transmit;

            if(res>9){

                transmit=res/10;
            }

            else{

                transmit=0;
            }

            int digit=res%10;
            sb.append(digit);
        }

        if(transmit>0) sb.append(transmit);
        System.out.println(sb.reverse());
        return "";

    }

    public static String deleteZeros(String number){

        int position=-1;

        for(int i=0; i<number.length(); i++){

            if(number.charAt(i)!='0'){

                position=i;
                return number.substring(position);
            }
        }

        return "0";
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String bigNumber=sc.nextLine();

        bigNumber=deleteZeros(bigNumber);

        String number=sc.nextLine();

        System.out.println(multiply(bigNumber, number));

    }
}