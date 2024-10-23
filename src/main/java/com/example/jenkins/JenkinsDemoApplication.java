package com.example.jenkins;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);


	public static void main(String[] args) {

		logger.info("This is the logger statement");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
