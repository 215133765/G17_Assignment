//package za.ac.cput.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import za.ac.cput.Entity.Booking;
//import za.ac.cput.Factory.BookingFactory;
//import za.ac.cput.Service.BookingService;
//
//import java.util.Set;
//
//@RestController
//@RequestMapping("/booking")
//public class BookingController {
//
//    @Autowired
//    private BookingService bookingService;
//
//    @RequestMapping(value = "/create", method = RequestMethod.POST)
//
//    @PostMapping("/create")
//    public Booking create (@RequestBody Booking booking)
//    {
//        Booking newBooking = BookingFactory.createBooking
//                (
//                        booking.getBookTime(),
//                        booking.getBookDate(),
//                        booking.getModuleCode(),
//                        booking.getModuleName()
//                );
//        return bookingService.create(newBooking);
//    }
//
//    @GetMapping("/read/{booking}")
//    public Booking read (@PathVariable String booking)
//    {
//        return bookingService.read(booking);
//    }
//
//    @GetMapping("/read")
//    public Booking read(@RequestBody Booking booking){
//        return bookingService.read(booking.getBookID());
//    }
//
//    @PostMapping ("/update")
//    public Booking update (@RequestBody Booking booking)
//    {
//        Booking update = bookingService.update(booking);
//
//        return update;
//    }
//
//    @DeleteMapping("/delete")
//    public boolean delete(@RequestBody Booking booking)
//    {
//
//        return bookingService.delete(booking.getBookID());
//    }
//
//
//    @GetMapping ("/getall")
//    public Set<Booking> getAll()
//    {
//        return bookingService.getAllBooking();
//    }
//}