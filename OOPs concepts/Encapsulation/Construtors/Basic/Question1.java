// Create a class Book with instance variables title and author. Use a constructor to initialize these variables.

class Book{
    String title,author;

    Book(String title, String author){
        this.title = title;
        this.author = author;

        System.out.println(title+ " "+author);
    }
}
public class Question1{
    public static void main(String[] args) {
        new Book("Godan", "Premchand");
    }
}