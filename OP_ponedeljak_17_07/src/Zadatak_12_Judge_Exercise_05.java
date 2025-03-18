import java.util.Scanner;

public class Zadatak_12_Judge_Exercise_05 {

    public static String multiplyBigNumbers(String bigNumber, String oneDigitNumber){

        int number=Integer.parseInt(oneDigitNumber);

        if(number==0) return "0";

        int remain=0;

        StringBuilder sb= new StringBuilder();

        for(int i=bigNumber.length()-1; i>=0; i--){

            char digit=bigNumber.charAt(i);
            int reallyDigit=Integer.parseInt(digit+"");
            int product=reallyDigit*number+remain;

            if(product>9){


                remain=product/10;
            }

            else{

                remain=0;
            }

            int digitBigNumber=product%10;
            sb.append(digitBigNumber);
        }

        if(remain!=0) sb.append(remain);
        System.out.println(sb.reverse());

        return "";
    }

    public static String deleteZeros(String bigNumber){

        int position=-1;

        for(int i=0; i<bigNumber.length(); i++){

            if(bigNumber.charAt(i)!= '0'){

                position=i;
                return bigNumber.substring(position);
            }
        }

        return "0";
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String number1=sc.nextLine();

        String bigNumberWithoutZeros=deleteZeros(number1);

        String number2=sc.nextLine();

        System.out.println(multiplyBigNumbers(bigNumberWithoutZeros, number2));
    }
}
