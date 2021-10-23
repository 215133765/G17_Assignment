//package za.ac.cput.Factory;
//
//import za.ac.cput.Entity.Booking;
//import za.ac.cput.Entity.UserBooking;
//import java.util.UUID;
//
//public class UserBookingFactory {
//
//    public static UserBooking createUserBooking(String bookID, String userID) {
//
//        if(bookID.isEmpty() || bookID.equalsIgnoreCase("null") ||
//           userID.isEmpty() || userID.equalsIgnoreCase("null") ||
//        bookID == null || userID == null) {
//            return new UserBooking.Builder().build();
//        }
//
//        //String bookID = UUID.randomUUID().toString();
//        //String userID = UUID.randomUUID().toString();
//        return new UserBooking.Builder()
//                .bookID(bookID)
//                .userID(userID)
//                .build();
//    }
//
//}
