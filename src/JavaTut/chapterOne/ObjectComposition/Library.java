package JavaTut.chapterOne.ObjectComposition;

class Author{
    String name;

    void printAuthorName(){
        System.out.println("Author name of this book is: "+this.name);
    }
}

class Book{
    String name;
    float price;
    Author author = new Author();
    void displayDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Price: "+this.price);
        author.printAuthorName();
    }
}


public class Library {
    public static void main(String[] args){
        Book book = new Book();
        book.name = "Jungle King";
        book.price = 200.67F;
        book.author.name = "Anshu";
        book.displayDetails();
    }
}
