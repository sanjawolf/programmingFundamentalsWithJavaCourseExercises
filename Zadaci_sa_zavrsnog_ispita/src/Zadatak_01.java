import java.util.Scanner;

public class Zadatak_01 {

//    public static StringBuilder toLowerCase(String string){
//
//        StringBuilder sb=new StringBuilder();
//
//        for(char c: string.toCharArray()){
//
//            if(c>='A' && c<='Z'){
//
//                char character=Character.toLowerCase(c);
//                sb.append(character);
//
//            }
//        }
//
//        return sb;
//    }
//
//    public static StringBuilder toUpperCase(String string){
//
//        StringBuilder sb=new StringBuilder();
//
//        for(char c: string.toCharArray()){
//
//            if(c>='a' && c<='z'){
//
//                char character=Character.toUpperCase(c);
//                sb.append(character);
//
//            }
//        }
//
//        return sb;
//    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String string=sc.nextLine();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Easter")) break;

            String [] commandParts=command.split(" ");

            String firstCommandPart=commandParts[0];

            if(firstCommandPart.equals("Replace")){

                String secondCommandPart=commandParts[1];

                String thirdCommandPart=commandParts[2];

                string=string.replaceAll(secondCommandPart, thirdCommandPart);

                System.out.println(string);
            }

            if(firstCommandPart.equals("Remove")){

                String secondCommandPart=commandParts[1];

                string=string.replaceAll(secondCommandPart, "");

                System.out.println(string);
            }

            if(firstCommandPart.equals("Includes")){

                String secondCommandPart=commandParts[1];

                System.out.println(string.contains(secondCommandPart));
            }

            if(firstCommandPart.equals("Change")){

                String secondCommandPart=commandParts[1];

                if(secondCommandPart.equals("Lower")){

                    string=string.toLowerCase();
                }
                if(secondCommandPart.equals("Upper")){

                   string=string.toUpperCase();
                }

                System.out.println(string);
            }

            if(firstCommandPart.equals("Reverse")){

                int secondCommandPart= Integer.parseInt(commandParts[1]);
                int thirdCommandPart= Integer.parseInt(commandParts[2]);

                String substring="";

                if(secondCommandPart>=0 && thirdCommandPart<string.length()-1) substring=string.substring(secondCommandPart, thirdCommandPart+1);

                for(int i=substring.length()-1; i>=0; i--){

                    System.out.printf("%c", substring.charAt(i));
                }
            }
        }
    }
}
