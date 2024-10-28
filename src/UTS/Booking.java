package UTS;

import java.time.LocalDate;

public class Booking {
    private Room room;
    private Customer customer;
    private LocalDate bookingDate;

    public Booking(Room room, Customer customer, LocalDate bookingDate) {
    this.room = room;
    this.customer = customer;
    this.bookingDate = bookingDate;
    }

    public void viewBookingDetails() {
        System.out.println("detail pesanan:");
        System.out.println("Nomor kamar: " + room.getRoomNumber());
        System.out.println("Status kamar: " + room.getStatus());
        System.out.println("Nama customer: " + customer.getName());
        System.out.println("Tanggal pesan: " + bookingDate);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }
}
