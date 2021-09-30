package pharmacy2021.userservice.domain.model.rows;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.util.Optional;

@Table(name = "USER")
public class UserRow {

    private final String firstName;
    private final Optional<String> middleName;
    private final String lastName;
    private final String email;
    private final Integer phoneNumber;
    private final String digitalResidenceAddress;


    public UserRow(UserRowBuilder builder) {
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

    public static UserRowBuilder newBuilder() {
        return new UserRowBuilder();
    }

    public static final class UserRowBuilder {

        private String firstName;
        private Optional<String> middleName;
        private String lastName;
        private String email;
        private Integer phoneNumber;
        private String digitalResidenceAddress;

        public UserRowBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserRowBuilder middleName(Optional<String> middleName) {
            this.middleName = middleName;
            return this;
        }

        public UserRowBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserRowBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserRowBuilder phoneNumber(Integer phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserRowBuilder digitalResidenceAddress(String digitalResidenceAddress) {
            this.digitalResidenceAddress = digitalResidenceAddress;
            return this;
        }

        public UserRow build() {
            return new UserRow(this);
        }

    }
}
