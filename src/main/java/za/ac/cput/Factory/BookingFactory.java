//package za.ac.cput.Factory;
//
//import za.ac.cput.Entity.Booking;
//import java.util.UUID;
////import java.time.*;
//
//public class BookingFactory {
//
//    public static Booking createBooking(String bookTime, String bookDate, String moduleCode, String moduleName) {
//       if(bookTime.isEmpty() || bookTime.equalsIgnoreCase("null") ||
//       bookDate.isEmpty() || bookDate.equalsIgnoreCase("null") ||
//       moduleCode.isEmpty() || moduleCode.equalsIgnoreCase("null") ||
//       moduleName.isEmpty() || moduleName.equalsIgnoreCase("null") ||
//       bookTime == null || bookDate == null || moduleCode == null || moduleName == null) {
//
//           return new Booking.Builder().build();
//       }
//
//        String bookID = UUID.randomUUID().toString();
//        return new Booking.Builder()
//               .bookTime(bookTime)
//               .bookDate(bookDate)
//               .moduleCode(moduleCode)
//               .moduleName(moduleName)
//                .bookID(bookID)
//               .build();
//    }
//}
//
//
//
