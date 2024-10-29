package UTS;


import UTS.Room;

public class User {
    private String name;
    private String email;
    private String role;

    public User(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getRole() {
        return role;
    }
    
    public void checkAvailability(Room room) {
        if (room.getStatus().equalsIgnoreCase("Tersedia")) {
            System.out.println("Kamar " + room.getRoomNumber() + " masih tersedia.");
        }
    }
}
