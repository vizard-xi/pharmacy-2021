package pharmacy2021.userservice.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import pharmacy2021.userservice.application.config.UserServiceConfig;

@SpringBootApplication
@Import({
		UserServiceConfig.class
})
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
