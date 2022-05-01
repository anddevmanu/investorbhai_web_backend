package org.investor.bhai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class InvestorbhaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestorbhaiApplication.class, args);
	}

}
