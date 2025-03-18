import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_08 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        Pattern regex= Pattern.compile("(?<employeename>[A-Z][a-z]{2,} [A-Z][a-z]{2,})#+(?<jobposition>[A-Z][a-z]+(&[A-Za-z]+){0,2})\\d{2}(?<companyname>[A-Z][a-zA-Z0-9]+ (JSC|Ltd.))");


        for(int i=1; i<=n; i++){

            String line=sc.nextLine();

            Matcher matcher= regex.matcher(line);

            if(matcher.find()){

                String employeeName= matcher.group("employeename");
                String jobPosition=matcher.group("jobposition");
                jobPosition=jobPosition.replace("&", " ");
                String companyName=matcher.group("companyname");

                    System.out.printf("%s is %s at %s\n", employeeName, jobPosition, companyName);

            }
        }


    }
}
