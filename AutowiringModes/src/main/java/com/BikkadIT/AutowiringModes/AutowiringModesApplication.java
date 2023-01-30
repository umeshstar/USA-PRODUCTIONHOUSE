package com.BikkadIT.AutowiringModes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.AutowiringModes.service.ReportServiceImpl;

@SpringBootApplication
public class AutowiringModesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AutowiringModesApplication.class, args);
		ReportServiceImpl bean = context.getBean(ReportServiceImpl.class);
		bean.GenrateReport();
	}

}
