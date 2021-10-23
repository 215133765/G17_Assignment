/**
 * Mziyanda Mwanda
 * 215133765
 * ADP3
 * Cap stone
 * */
package za.ac.cput.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private String userId;
    private String firstName, lastName;

    private User(Builder builder){
        this.userId = builder.userId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder{
        private String userId, firstName, lastName;

        public Builder setUserId(String userId){
            this.userId = userId;

            return this;
        }

        public Builder setFirstName(String firstName){
            this.firstName = firstName;

            return this;
        }

        public Builder setLastName(String lastName){
            this.lastName = lastName;

            return this;
        }



        public User build(){

            return new User(this);
        }

        public Builder copy(User user){
            this.userId = user.userId;
            this.firstName = user.firstName;
            this.lastName = user.lastName;

            return this;
        }



    }
}
