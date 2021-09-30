package pharmacy2021.userservice.domain.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pharmacy2021.userservice.domain.api.UserServiceAPI;
import pharmacy2021.userservice.domain.model.User;
import pharmacy2021.userservice.domain.model.rows.UserRow;
import pharmacy2021.userservice.domain.repository.UserRepository;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceRestService implements UserServiceAPI {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceRestService.class);

    private final UserRepository userRepository;

    public UserServiceRestService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Response createUser(User user) {
        LOGGER.info("Create new User: ", user);

        try {
            UserRow userRow = UserRow.newBuilder().firstName(user.firstName())
                    .middleName(user.middleName())
                    .lastName(user.lastName())
                    .email(user.email())
                    .phoneNumber(user.phoneNumber())
                    .digitalResidenceAddress(user.digitalResidenceAddress())
                    .build();

            userRepository.save(userRow);
            return Response.status(200).build();
        } catch (Exception exception) {
            return Response.serverError().build();
        }
    }

    @Override
    public List<User> getUsers() {
        LOGGER.info("Get All Users");
        List<User> user = new ArrayList<>();
        userRepository.findAll().stream().map(userRow -> user.add(
                new User.UserBuilder()
                        .firstName(userRow.firstName())
                        .middleName(userRow.middleName())
                        .lastName(userRow.lastName())
                        .email(userRow.email())
                        .phoneNumber(userRow.phoneNumber())
                        .digitalResidenceAddress(userRow.digitalResidenceAddress())
                        .build())
        );
        return user;
    }

    @Override
    public User getUser(Long userID) {
        return null;
    }

    @Override
    public Response updateUser(Long userID, User user) {
        return null;
    }

    @Override
    public Response deleteUser(Long userID) {
        return null;
    }
}
