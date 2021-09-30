package pharmacy2021.userservice.domain.api;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pharmacy2021.userservice.domain.model.User;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RestController
@RequestMapping(value = "/user")
@Singleton
@Transactional
public interface UserServiceAPI {

    @PostMapping(value = "/createUser")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response createUser(@RequestBody User user);

    @Produces(MediaType.APPLICATION_JSON)
    @GetMapping(value = "/getUsers")
    List<User> getUsers();

    @Produces(MediaType.APPLICATION_JSON)
    @GetMapping(value = "/getUser/{userID}")
    User getUser(@PathParam("userID") Long userID);

    @Produces(MediaType.APPLICATION_JSON)
    @PutMapping(value = "/updateUser/{userID}")
    Response updateUser(@PathParam("userID") Long userID, @RequestBody User user);

    @Produces(MediaType.APPLICATION_JSON)
    @DeleteMapping(value = "/deleteUser/{userID}")
    Response deleteUser(@PathParam("userID") Long userID);

}
