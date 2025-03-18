import java.util.Scanner;

public class Zadatak_08_Judge_Exercise_02 {

    static class Article{

        private String title;
        private String content;
        private String author;

        public Article(String t, String c, String a){

           this.title=t;
           this.content=c;
           this.author=a;
        }

        public String getContent(){

            return this.content;
        }

        public void setContent(String givenContent){

            this.content=givenContent;
        }

        public String getAuthor(){

            return this.author;
        }

        public void setAuthor(String givenAuthor){

            this.author=givenAuthor;
        }

        public String getTitle(){

            return this.title;
        }

        public void setTitle(String givenTitle){

            this.title=givenTitle;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(", ");

        String title=parts[0];
        String content=parts[1];
        String author=parts[2];

        int n=Integer.parseInt(sc.nextLine());

        Article article=new Article(title, content, author);

        for(int i=1; i<=n; i++){

            String command=sc.nextLine();

            String [] partsCommand=command.split(": ");
            String part1=partsCommand[0];
            String part2=partsCommand[1];

            if(part1.equals("Edit")){

                article.setContent(part2);


            }

            if(part1.equals("ChangeAuthor")){

                article.setAuthor(part2);


            }

            if(part1.equals("Rename")){

                article.setTitle(part2);


            }
        }

        String rez=article.toString();

        System.out.println(rez);

    }
}
