

    import java.util.Scanner;

    public class Zadatak_06_Exercise_01 {

        public static boolean contains(String part){

            int n=part.length();

            if(n<3 || n>16) return false;

            for(int i=0; i<n; i++){

                char character=part.charAt(i);

                if(!Character.isLetterOrDigit(character) && character!='-' && character!='_') return false;
            }

            return true;
        }

//    public static StringBuilder contains(String part){
//
//        int n=part.length();
//
//        StringBuilder sb=new StringBuilder("");
//
//        for(int i=0; i<n; i++){
//
//            char character=part.charAt(i);
//
//            boolean contains=true;
//
//            if(n>=3 && n<=16){
//
//                if(character>='A' && character<='Z' || character>='a' && character<='z' || character>='0' && character<='9' || character=='-' || character=='_'){
//
//                    sb.append(character);
//
//
//                }
//
//                else{
//
//                    contains=false;
//                    break;
//                }
//
//
//
//
//            }
//
//
//
//
//
//
//        }
//
//
//        return sb;
//
//    }

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            String text=sc.nextLine();

            String [] parts=text.split(", ");

            for(String part: parts){

//            if(!contains(part).toString().equals("")) System.out.println(contains(part));

                if(contains(part)) System.out.println(part);
            }
        }
    }

