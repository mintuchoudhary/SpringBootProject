package com.m2.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.logging.Logger;

//import de.codecentric.boot.admin.config.EnableAdminServer;
@SpringBootApplication
//@EnableScheduling  // to enable @Scheduled
//@EnableEurekaServer
//@EnableZuulProxy
//@RefreshScope
//@EnableAdminServer
@EnableSwagger2
public class SpringBootWebApplication implements ApplicationRunner {
	private static final Logger LOG = Logger.getLogger(SpringBootWebApplication.class.getName());

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public static void main(String[] args) {
		LOG.info("start of main class");
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.m2.springboot")).build();
	}

	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		sendMessage("Hi Welcome to Spring For Apache Kafka");
	}

	@KafkaListener(topics = "kafkatopic", groupId = "group-id")
	public void listen(String message) {
		System.out.println("Received Messasge in group - group-id: " + message);
	}

	public void sendMessage(String msg) {
		kafkaTemplate.send("kafkatopic", msg);
	}
}


/**
 * For http generate keystore.p12 by keytool command
 * keytool -genkey -alias tomcat -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore keystore.p12 -validity 3650
 * Port change for webserver
 *
 * # will register all services running on each port and IP address, also known as Discovery service
 *
 * #Zuul Server is a gateway application that handles all the requests and does the dynamic
 * # routing of microservice applications. The Zuul Server is also known as Edge Server.
 */
