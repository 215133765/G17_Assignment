//package za.ac.cput.Service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import za.ac.cput.Entity.Booking;
//import za.ac.cput.Entity.UserBooking;
//import za.ac.cput.Repository.impl.UserBookingRepository;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.stream.Collectors;
////import java.util.stream.Collectors;
//
//@Service
//public class UserBookingService implements IUserBookingService {
//
//    private static UserBookingService service = null;
//
//    public static UserBookingService getService()
//    {
//        if (service == null)
//        {
//            service = new UserBookingService();
//        }
//        return service;
//    }
//
//    @Autowired
//    private UserBookingRepository repository;
//
//    @Override
//    public UserBooking create(UserBooking userbooking) {
//        return this.repository.save(userbooking);
//    }
//
//    @Override
//    public UserBooking read(String s) {
//
//        return this.repository.findById(s).orElse(null);
//
//    }
//
//    @Override
//    public UserBooking update(UserBooking userbooking) {
//
//        if(this.repository.existsById(userbooking.getUserID())){
//
//            return this.repository.save(userbooking);
//        }
//
//        return null;
//    }
//
//    @Override
//    public boolean delete(String s) {
//        this.repository.deleteById(s);
//
//        if (this.repository.existsById(s))
//
//            return false;
//        else
//            return true;
//
//    }
//
//    @Override
//    public Set<UserBooking> getAllBooking() {
//
//        return this.repository.findAll().stream().collect(Collectors.toSet());
//    }
//
//
//    public Set<UserBooking>getAllBookingStartWithA(){
//        Set<UserBooking> bookingWithA = new HashSet<>();
//        Set<UserBooking> userbookings = getAllBooking();
//        for(UserBooking userbooking : userbookings){
//            if(UserBooking.getUserID().trim().toLowerCase().startsWith("a")){
//                bookingWithA.add(userbooking);
//            }
//        }
//        return bookingWithA;
//    }
//
//    @Override
//    public Set<UserBooking> getAllUserBooking() {
//        return null;
//    }
//
//    @Override
//    public UserBooking getUserBookingDescription(String userbookingDescription) {
//
//        UserBooking userbooking = null;
//        Set<UserBooking> userbookings = getAllBooking();
//
//        for (UserBooking ubook : userbookings)
//            if (userbooking.getUserID().equals(userbookingDescription)){
//
//                userbooking = ubook;
//                break;
//            }
//
//        return  userbooking;
//    }
//}
//
