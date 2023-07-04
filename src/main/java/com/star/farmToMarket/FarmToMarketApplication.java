package com.star.farmToMarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EntityScan(basePackages= {"com.star.entity"})

public class FarmToMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmToMarketApplication.class, args);
	}

}
