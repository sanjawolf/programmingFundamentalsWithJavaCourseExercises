import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employees_Problem {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        Pattern regex=Pattern.compile("(?<name>[A-Z][a-z]{2,} [A-Z][a-z]{2,})#+(?<jobposition>[A-Z][a-z]+(&[A-Z][a-z]+){0,2})[0-9]{2}(?<company>[A-Z][A-Za-z0-9]+ (JSC|Ltd.))");

        for(int i=0; i<=n; i++){

            String input=sc.nextLine();

            Matcher matcher= regex.matcher(input);

            if(matcher.find()){

                String name= matcher.group("name");
                String jobPosition=matcher.group("jobposition");
                String company=matcher.group("company");
                jobPosition=jobPosition.replace("&", " ");

                System.out.printf("%s is %s at %s\n", name, jobPosition, company);
            }
        }
    }
}
