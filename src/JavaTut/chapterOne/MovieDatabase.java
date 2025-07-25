package JavaTut.chapterOne;

class Actor{
    String name;

}


class Movie{
    String title;
    String genre;
    int rating;
    Actor actor1 = new Actor();
    Actor actor2 = new Actor();
    void display(){
        System.out.println("Title: "+this.title);
        System.out.println("Genre: "+this.genre);
        System.out.println("Rating: "+this.rating);
    }

    void saveActorName(String name,String name2){
        actor1.name = name;
        actor2.name = name2;
    }

    void displayActorName(){
        System.out.println("This movie actor 1 name is: "+actor1.name);
        System.out.println("This movie actor 2 name is: "+actor2.name);
    }
}


public class MovieDatabase {
    public static void main(String[] args){
        Movie ram = new Movie();
        Movie ganga = new Movie();
        Movie got = new Movie();
        ram.rating = 9;
        ram.genre = "Religious";
        ram.title = "My Lord Ram";
        ram.saveActorName("Ram Kapoor","Puja Singh");
        ram.displayActorName();
        ram.display();
        ganga.title = "Ganga teri naam mali";
        ganga.genre = "Romantic";
        ganga.rating = 4;
        ganga.display();
        got.title = "Game of thrones";
        got.rating = 8;
        got.genre = "Action";
        got.display();
    }
}
