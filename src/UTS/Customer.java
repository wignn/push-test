package UTS;

import UTS.Booking;
import java.util.List;

public class Customer extends User {
    public Customer(String name, String email) {
        super(name, email, "customer");
    }

    public void makeBooking(Room room) {
        if (room.getStatus().equalsIgnoreCase("Tersedia")) {
            System.out.println("Pesanan berhasil untuk kamar " + room.getRoomNumber());
            room.setStatus("Dipesan");
        } else {
            System.out.println("Kamar tidak tersedia.");
        }
    }

    public void viewOwnBooking(List<Booking> bookings) {
        boolean found = false;
    for (Booking booking : bookings) {
        if (booking.getCustomer().getName().equals(this.getName())) {
            booking.viewBookingDetails();
            found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada pesanan untuk customer " + this.getName());
            
        }
    }
}
