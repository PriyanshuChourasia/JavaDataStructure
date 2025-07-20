package movie_ticket_booking;

import java.util.Scanner;


public class MovieTicketBooking {

    class Movie{
        private String name;

        private float ticketprice;

        private String[] shift;

        Movie next;

        Movie(String name, float ticketprice, String[] shift){
            this.name = name;
            this.ticketprice = ticketprice;
            this.shift = shift;
            this.next = null;
        }
    }

    Movie head;
    void insertMovie(String name, float ticketprice, String[] shift){
        Movie movie = new Movie(name,ticketprice,shift);
        movie.next = head;
        head = movie;
    }

    void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Movie temp = head;
        System.out.println("Movie List: ");
        while (temp.next != null){
            System.out.println("Name: "+ temp.name);
            System.out.println("Price: "+ temp.ticketprice+ " rupees");
            System.out.println("Shift: ");
            for (int i=0; i < temp.shift.length; i++ )
            {
                System.out.print(temp.shift[i]);
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        MovieTicketBooking movieTicketBooking = new MovieTicketBooking();

        String[] shift1 = {"Morning"};
        String[] shift2 = {"Morning","Afternoon"};
        String[] shift3 = {"Morning", "Afternoon", "Night"};
//        Movie 1
        movieTicketBooking.insertMovie("Dangal",200.00F,shift1);
//        Movie 2
        movieTicketBooking.insertMovie("3 idiots",180.20F,shift2);

        sc.close();
    }
}
