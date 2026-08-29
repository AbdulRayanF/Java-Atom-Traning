import java.util.*;


class InvalidSeatException extends Exception {
    InvalidSeatException(String msg) { super(msg); }
}
class SeatAlreadyBookedException extends Exception {
    SeatAlreadyBookedException(String msg) { super(msg); }
}
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) { super(msg); }
}
class BookingNotFoundException extends Exception {
    BookingNotFoundException(String msg) { super(msg); }
}
class InvalidFareException extends Exception {
    InvalidFareException(String msg) { super(msg); }
}


abstract class Bus {
    int busNo, seats;
    String route;
    double fare;
    boolean[] booked;

    Bus(int no, String route, int seats) {
        busNo = no;
        this.route = route;
        this.seats = seats;
        booked = new boolean[seats + 1];
    }

    abstract void showDetails();
    abstract double calculateFare();
}


class ACBus extends Bus {
    ACBus(int no, String route, int seats) {
        super(no, route, seats);
        fare = 500;
    }

    void showDetails() {
        System.out.println("AC Bus: " + busNo + " " + route);
    }

    double calculateFare() {
        return fare;
    }
}


class NonACBus extends Bus {
    NonACBus(int no, String route, int seats) {
        super(no, route, seats);
        fare = 300;
    }

    void showDetails() {
        System.out.println("Non-AC Bus: " + busNo + " " + route);
    }

    double calculateFare() {
        return fare;
    }
}


class Booking {
    private String name;
    private int age, seat;
    static int totalBookings = 0;
    int bookingId;

    Booking(String name, int age, int seat) {
        this.name = name;
        this.age = age;
        this.seat = seat;
        bookingId = ++totalBookings;
    }

    void show() {
        System.out.println("Booking ID: " + bookingId +
                ", Name: " + name + ", Seat: " + seat);
    }
}


public class Main {

    static void bookTicket(Bus b, String name, int age, int seat)
            throws Exception {

        if (age < 5)
            throw new InvalidAgeException("Age is invalid");

        if (seat <= 0 || seat > b.seats)
            throw new InvalidSeatException("Invalid seat");

        if (b.booked[seat])
            throw new SeatAlreadyBookedException("Seat already booked");

        if (b.calculateFare() <= 0)
            throw new InvalidFareException("Invalid fare");

        b.booked[seat] = true;

        Booking x = new Booking(name, age, seat);
        x.show();
        System.out.println("Fare: " + b.calculateFare());
    }


    static void bookTicket(Bus b, String name, int age, int seat,
                           boolean window) throws Exception {
        bookTicket(b, name, age, seat);

        if (window)
            System.out.println("Window seat requested");
    }

    static void cancelTicket(Bus b, int seat)
            throws BookingNotFoundException {

        if (seat <= 0 || seat > b.seats || !b.booked[seat])
            throw new BookingNotFoundException("Booking not found");

        b.booked[seat] = false;
        System.out.println("Ticket cancelled for seat " + seat);
    }

    public static void main(String[] args) {

        Bus b1 = new ACBus(101, "Bangalore-Mysore", 5);
        Bus b2 = new NonACBus(102, "Bangalore-Chennai", 5);


        b1.showDetails();
        b2.showDetails();

        try {
            bookTicket(b1, "Rayan", 20, 1);
            bookTicket(b1, "Rahul", 22, 2, true);

            cancelTicket(b1, 1);

            // Invalid operations
            bookTicket(b1, "Amit", 20, 2);
            bookTicket(b1, "John", 20, 10);
            bookTicket(b1, "Sam", 3, 3);
            cancelTicket(b1, 5);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Total bookings: " + Booking.totalBookings);
    }
}