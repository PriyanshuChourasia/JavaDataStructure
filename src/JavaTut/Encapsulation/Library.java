package JavaTut.Encapsulation;

class Book{
    private String title;
    private int price;

    public int getPrice(){
        return this.price;
    }


    public String getTitle(){
        return this.title;
    }

}


public class Library {
    public static void main(String[] args){
        Book book = new Book();
//        book.setTitle("Harry Potter");
//        book.setPrice(456);
        System.out.println(book.getTitle());
        System.out.println(book.getPrice());
    }
}
