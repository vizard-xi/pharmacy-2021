package pharmacy2021.userservice.domain.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.util.Optional;

@JsonDeserialize(builder = User.UserBuilder.class)
public class User {

    private final String firstName;
    private final Optional<String> middleName;
    private final String lastName;
    private final String email;
    private final Integer phoneNumber;
    private final String digitalResidenceAddress;

    public User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.digitalResidenceAddress = builder.digitalResidenceAddress;
    }

    public String firstName() {
        return firstName;
    }

    public Optional<String> middleName() {
        return middleName;
    }

    public String lastName() {
        return lastName;
    }

    public String email() {
        return email;
    }

    public Integer phoneNumber() {
        return phoneNumber;
    }

    public String digitalResidenceAddress() {
        return digitalResidenceAddress;
    }

    public static UserBuilder newBuilder() {
        return new UserBuilder();
    }

    @JsonPOJOBuilder
    public static final class UserBuilder {

        private String firstName;
        private Optional<String> middleName;
        private String lastName;
        private String email;
        private Integer phoneNumber;
        private String digitalResidenceAddress;

        @JsonSetter
        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        @JsonSetter
        public UserBuilder middleName(Optional<String> middleName) {
            this.middleName = middleName;
            return this;
        }

        @JsonSetter
        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        @JsonSetter
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        @JsonSetter
        public UserBuilder phoneNumber(Integer phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        @JsonSetter
        public UserBuilder digitalResidenceAddress(String digitalResidenceAddress) {
            this.digitalResidenceAddress = digitalResidenceAddress;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}
