package countries.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import countries.beans.Cities;
import countries.beans.Country;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Country country() {
		Country bean = new Country();
		bean.setName("France");
		bean.setContinent("Europe");
		bean.setUNMember(true);
		return bean;
	}
	
	@Bean
		public Cities cities() {
		Cities bean = new Cities();
		bean.setCapital("Paris");
		bean.setSecondLargest("Marseille");
		return bean;
	}
}
