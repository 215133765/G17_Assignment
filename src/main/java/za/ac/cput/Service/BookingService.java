//package za.ac.cput.Service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import za.ac.cput.Entity.Booking;
//import za.ac.cput.Repository.impl.BookingRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//import java.util.stream.Collectors;
////import java.util.stream.Collectors;
//
//@Service
//public class BookingService implements IBookingService {
//
//    private static BookingService service = null;
//
//    public static BookingService getService()
//    {
//        if (service == null)
//        {
//            service = new BookingService();
//        }
//        return service;
//    }
//
//    @Autowired
//    private BookingRepository repository;
//
//    @Override
//    public Booking create(Booking booking) {
//        return this.repository.save(booking);
//    }
//
//    @Override
//    public Booking read(String s) {
//
//        return this.repository.findById(s).orElse(null);
//
//    }
//
//    @Override
//    public Booking update(Booking booking) {
//
//        if(this.repository.existsById(booking.getBookID())){
//
//            return this.repository.save(booking);
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
//    public Set<Booking> getAllBooking() {
//
//        return this.repository.findAll().stream().collect(Collectors.toSet());
//    }
//
//
//    public Set<Booking>getAllBookingStartWithA(){
//        Set<Booking> bookingWithA = new HashSet<>();
//        Set<Booking> bookings = getAllBooking();
//        for(Booking booking : bookings){
//            if(booking.getModuleCode().trim().toLowerCase().startsWith("a")){
//                bookingWithA.add(booking);
//            }
//        }
//        return bookingWithA;
//    }
//
//    @Override
//    public Booking getBookingDescription(String bookingDescription) {
//
//        Booking booking = null;
//        Set<Booking> bookings = getAllBooking();
//
//        for (Booking book : bookings)
//            if (booking.getModuleCode().equals(bookingDescription)){
//
//                booking = book;
//                break;
//            }
//
//        return  booking;
//    }
//}
