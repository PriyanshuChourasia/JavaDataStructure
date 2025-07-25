package JavaTut.chapterOne;


class Book{
    String title;
    String author;

    void read(){
        System.out.println("You're reading "+this.title);
        System.out.println("The author name:  "+this.author);
    }
}

public class Library {
    public static void main(String[] args){
        Book book = new Book();
        book.title = "C Programming";
        book.read();
    }
}
