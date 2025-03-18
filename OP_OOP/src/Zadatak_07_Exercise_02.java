import java.util.Scanner;

public class Zadatak_07_Exercise_02 {

    static class Article{

        private String title;
        private String content;
        private String author;

        public Article(String naslov, String sadrzaj, String autor){

            this.title=naslov;
            this.content=sadrzaj;
            this.author=autor;
        }

        public String getContent(){

            return this.content;
        }

        public void setContent(String noviSadrzaj){

            this.content=noviSadrzaj;
        }

        public String getAuthor(){

            return this.author;
        }

        public void setAuthor(String noviAutor){

            this.author=noviAutor;
        }

        public String getTitle(){

            return this.title;
        }

        public void setTitle(String noviNaslov){

            this.title=noviNaslov;
        }

        public void Edit(String content){

                this.setContent(content);
        }

        public void Rename(String title){

            this.setTitle(title);
        }

        public void ChangeAuthor(String author){

            this.setAuthor(author);
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
        String author=parts[2];
        String content=parts[1];

        Article article=new Article(title, content, author);

        int n=Integer.parseInt(sc.nextLine());

        for(int i=1; i<=n; i++){

            String command=sc.nextLine();

            String [] commandParts=command.split(": ");

            if(commandParts[0].equals("ChangeAuthor")){

                String newAuthor=commandParts[1];
                article.ChangeAuthor(newAuthor);
            }

            if(commandParts[0].equals("Edit")){

                String newContent=commandParts[1];
                article.Edit(newContent);
            }

            if(commandParts[0].equals("Rename")){

                String newTitle=commandParts[1];
                article.Rename(newTitle);
            }
        }

        System.out.println(article);
    }
}
