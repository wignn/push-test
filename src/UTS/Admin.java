package UTS;

import java.util.List;
public class Admin extends User {
    
public Admin(String name, String email) {
    super(name, email, "admin"); 
    }
public void updateRoomStatus(Room room, String status) {
    room.setStatus(status);
        System.out.println("Kamar " + room.getRoomNumber() + " status saat ini: " + status);
    }
public void viewAllBookings(List<Booking> bookings) {
    if (bookings.isEmpty()) {
            System.out.println("Pesanan tidak ditemukan.");
        } else {
            for (Booking booking : bookings) {
                booking.viewBookingDetails();
                System.out.println("------------------------");
            }
        }
    }
}

