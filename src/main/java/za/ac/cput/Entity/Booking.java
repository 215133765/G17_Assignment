//package za.ac.cput.Entity;
//
////import java.time.*;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//@Entity
//public class Booking {
//
//    @Id
//    private String bookID;
//    private String bookTime;
//    private String bookDate;
//    private String moduleCode;
//    private String moduleName;
//
//    private Booking(){
//
//    }
//    private Booking(Builder builder) {
//        this.bookID = builder.bookID;
//        this.bookTime = builder.bookTime;
//        this.bookDate = builder.bookDate;
//        this.moduleCode = builder.moduleCode;
//        this.moduleName = builder.moduleName;
//    }
//
//    //Getters
//    public String getBookID() {
//        return bookID;
//    }
//
//    public String getBookTime() {
//        return bookTime;
//    }
//
//    public String getBookDate() {
//        return bookDate;
//    }
//
//    public String getModuleCode() {
//        return moduleCode;
//    }
//
//    public String getModuleName() {
//        return moduleName;
//    }
//
//    //Builders
//    public static class Builder {
//        private String bookID;
//        private String bookTime;
//        private String bookDate;
//        private String moduleCode, moduleName;
//
//        public Builder bookID(String bookID) {
//            this.bookID = bookID;
//            return this;
//        }
//
//        public Builder bookTime(String bookTime) {
//            this.bookTime = bookTime;
//            return this;
//        }
//
//        public Builder bookDate(String bookDate) {
//            this.bookDate = bookDate;
//            return this;
//        }
//
//        public Builder moduleCode(String moduleCode) {
//            this.moduleCode = moduleCode;
//            return this;
//        }
//
//        public Builder moduleName(String moduleName) {
//            this.moduleName = moduleName;
//            return this;
//        }
//
//        public Builder copy(Booking booking) {
//            this.bookID = booking.bookID;
//            this.bookTime = booking.bookTime;
//            this.bookDate = booking.bookDate;
//            this.moduleCode = booking.moduleCode;
//            this.moduleName = booking.moduleName;
//            return this;
//        }
//
//        public Booking build() {
//            return new Booking(this);
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Builder{" +
//                "bookID=" + bookID +
//                ", bookTime=" + bookTime +
//                ", bookDate=" + bookDate +
//                ", moduleCode='" + moduleCode + '\'' +
//                ", moduleName='" + moduleName + '\'' +
//                '}';
//    }
//
//}
