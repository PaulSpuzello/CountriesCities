package countries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import countries.beans.Country;
import countries.controller.BeanConfiguration;

@SpringBootApplication
public class CountriesWithCitiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountriesWithCitiesApplication.class, args);
	}
}