package me.sathish.sathishdiscovery;

import com.netflix.discovery.EurekaNamespace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@EnableConfigurationProperties({ApplicationProperties.class})
@SpringBootApplication
public class SathishDiscoveryApplication {
	public static void main(String[] args) {
		SpringApplication.run(SathishDiscoveryApplication.class, args);
	}

}
