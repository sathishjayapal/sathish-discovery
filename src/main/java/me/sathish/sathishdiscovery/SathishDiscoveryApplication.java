package me.sathish.sathishdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SathishDiscoveryApplication {
    public static void main(String[] args) {
        SpringApplication.run(SathishDiscoveryApplication.class, args);
    }
}
