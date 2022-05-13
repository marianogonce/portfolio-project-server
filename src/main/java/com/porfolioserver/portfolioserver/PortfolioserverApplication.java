package com.porfolioserver.portfolioserver;

import com.porfolioserver.portfolioserver.properties.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class PortfolioserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioserverApplication.class, args);
	}


}
