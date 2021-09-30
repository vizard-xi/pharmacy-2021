package pharmacy2021.userservice.application.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pharmacy2021.userservice.domain.api.UserServiceAPI;
import pharmacy2021.userservice.domain.repository.UserRepository;
import pharmacy2021.userservice.domain.repository.UserRepositoryConfig;
import pharmacy2021.userservice.domain.rest.UserServiceRestService;


@Configuration
@Import({
        UserRepositoryConfig.class
})
public class UserServiceConfig {

//    @Bean()
//    public UserServiceAPI userServiceAPI() {
//        return new UserServiceRestService();
//    }
}
