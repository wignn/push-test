package UTS;

import UTS.Admin;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplikasiHotel {
    public static void main(String[] args) {
        Room room1 = new Room(101, "Tersedia");
        Room room2 = new Room(102, "Dipesan");

        Admin admin = new Admin("Admin", "admin1@gmail.com");
        Customer customer = null;

        Scanner sc = new Scanner(System.in);
        List<Booking> bookings = new ArrayList<>(); 

        User currentUser;
        System.out.println("Login sebagai? : 1. Admin 2. Customer");
        int userType = sc.nextInt();
        sc.nextLine(); 

        if (userType == 1) {
            currentUser = admin; 
        } else {
            System.out.print("Masukkan nama customer: ");
            String customerName = sc.nextLine();
            System.out.print("Masukkan email customer: ");
            String customerEmail = sc.nextLine();
            customer = new Customer(customerName, customerEmail);
            currentUser = customer; 
        }

        if (currentUser.getRole().equals("admin")) {
            System.out.println("Selamat datang Admin!");
            System.out.println("1. Cek ketersediaan kamar");
            System.out.println("2. Update status kamar");
            System.out.println("3. Melihat semua pesanan");
        } else {
            System.out.println("Selamat datang " + customer.getName() + "!");
            System.out.println("1. Cek ketersediaan kamar");
            System.out.println("2. Buat pesanan");
            System.out.println("3. Melihat detail pesanan kamar Anda");
        }

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            currentUser.checkAvailability(room1);
            
        if (currentUser.getRole().equals("customer")) {
            System.out.println("Apakah Anda ingin memesan kamar ini? (yes/no)");
                String bookRoom = sc.nextLine();
            if (bookRoom.equalsIgnoreCase("yes")) {
                    customer.makeBooking(room1);
                    Booking newBooking = new Booking(room1, customer, LocalDate.now());
                    bookings.add(newBooking);
                    System.out.println("Kamar berhasil dipesan!");
                }
            }
        } else if (choice == 2 && currentUser.getRole().equals("customer")) {           
            customer.makeBooking(room1);
            Booking newBooking = new Booking(room1, customer, LocalDate.now());
            bookings.add(newBooking);
            System.out.println("Kamar berhasil dipesan!");
            
        } else if (choice == 2 && currentUser.getRole().equals("admin")) {
            System.out.println("Masukkan nomor kamar untuk update: ");
            int roomNumber = sc.nextInt();
            System.out.println("Masukkan status baru (Tersedia, Dipesan, atau sedang dalam pembersihan): ");
            String newStatus = sc.next();
            if (roomNumber == room1.getRoomNumber()) {
                admin.updateRoomStatus(room1, newStatus);
            } else if (roomNumber == room2.getRoomNumber()) {
                admin.updateRoomStatus(room2, newStatus);
            } else {
                System.out.println("Kamar tidak ditemukan.");
            }
        } else if (choice == 3 && currentUser.getRole().equals("admin")) {
            admin.viewAllBookings(bookings);
        } else if (choice == 3 && currentUser.getRole().equals("customer")) {
            customer.viewOwnBooking(bookings);
        } else {
            System.out.println("Invalid choice");
        }

        System.out.println("Apakah Anda ingin melihat detail pesanan sebelum keluar? (yes/no)");
        String viewFinalDetails = sc.nextLine();
        if (viewFinalDetails.equalsIgnoreCase("yes")) {
            if (currentUser.getRole().equals("admin")) {
                admin.viewAllBookings(bookings);
            } else if (currentUser.getRole().equals("customer")) {
                customer.viewOwnBooking(bookings);
            }
        }
    }
}
