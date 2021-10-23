//package za.ac.cput.Entity;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//@Entity
//public class UserBooking {
//
//    @Id
//    private static String userID;
//    @Id
//    private String bookID;
//
//    private UserBooking(){
//
//    }
//
//    private UserBooking(Builder builder){
//        this.userID = userID;
//        this.bookID = bookID;
//    }
//
//    //Getters
//    public static String getUserID(){
//        return userID;
//    }
//    public String getBookID(){
//        return bookID;
//    }
//
//    //Builders
//    public static class Builder{
//        private String userID, bookID;
//
//        public Builder userID(String userID){
//            this.userID = userID;
//            return this;
//        }
//        public Builder bookID(String bookID){
//            this.bookID = bookID;
//            return this;
//        }
//
//        public Builder copy(UserBooking userbooking){
//            this.userID = userbooking.userID;
//            this.bookID = userbooking.bookID;
//            return this;
//        }
//
//        public UserBooking build(){
//            return new UserBooking(this);
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Builder{" +
//                "userID=" + userID +
//                ", bookID=" + bookID +
//                '}';
//    }
//}
