package uz.pdp.enums.equals_hashcode;

public class User {

    public String phoneNumber;
    public String username;
    public String bio;
//    public String status;
    public Status status;

//    public User(String phoneNumber, String username, String bio, String status) {
//        this.phoneNumber = phoneNumber;
//        this.username = username;
//        this.bio = bio;
//        this.status = status;
//    }


    public User(String phoneNumber, String username, String bio, Status status) {
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.bio = bio;
        this.status = status;
    }
}
