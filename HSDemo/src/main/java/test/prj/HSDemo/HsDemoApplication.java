package test.prj.HSDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import test.prj.HSDemo.service.UserService;

@SpringBootApplication
public class HsDemoApplication {
	@Bean
	public UserService getUserService() {
		return new UserService();

	}

	public static void main(String[] args) {
		SpringApplication.run(HsDemoApplication.class, args);
	}

}
