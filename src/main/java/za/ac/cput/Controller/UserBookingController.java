//package za.ac.cput.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import za.ac.cput.Entity.Booking;
//import za.ac.cput.Entity.UserBooking;
//import za.ac.cput.Factory.UserBookingFactory;
//import za.ac.cput.Service.BookingService;
//import za.ac.cput.Service.UserBookingService;
//import java.util.Set;
//
//@RestController
//@RequestMapping("/UserBooking")
//public class UserBookingController {
//
//    @Autowired
//    private UserBookingService userBookingService;
//
//    @RequestMapping(value = "/create", method = RequestMethod.POST)
//
//    @PostMapping("/create")
//    public UserBooking create (@RequestBody UserBooking userbooking) {
//
//        UserBooking newUserBooking = UserBookingFactory.createUserBooking( userbooking.getBookID(), userbooking.getUserID());
//        return userBookingService.create(newUserBooking);
//    }
//
//    @GetMapping("/read/{userbooking}")
//    public UserBooking read (@PathVariable String userbooking)
//    {
//        return userBookingService.read(userbooking);
//    }
//
//    @GetMapping("/read")
//    public UserBooking read (@RequestBody UserBooking userbooking) {
//        return userBookingService.read(userbooking.getUserID());
//    }
//
//    @PostMapping("/update")
//    public UserBooking update (@RequestBody UserBooking userbooking) {
//        UserBooking update = userBookingService.update(userbooking);
//
//        return update;
//    }
//
//    @DeleteMapping("/delete")
//    public boolean delete (@RequestBody UserBooking userbooking) {
//        return userBookingService.delete(userbooking.getUserID());
//    }
//
//    @GetMapping("/getall")
//    public Set<UserBooking> getAll() {return userBookingService.getAllBooking();}
//
//
//}
