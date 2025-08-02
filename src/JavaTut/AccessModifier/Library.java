package JavaTut.AccessModifier;

class Book{
    private String title = "Neural Network";
    protected String author = "Simon S Haykin";

    public int pages = 456;

    void getBookInfo(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Pages: "+this.pages);
    }
}





public class Library {
    public static void main(String[] args){
        Book book = new Book();
        System.out.println(book.author);
        System.out.println(book.pages);
        book.getBookInfo();
    }
}
