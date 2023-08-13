package com.vf.dev.msuniversidadapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsWebFilter;

import java.util.Arrays;


@SpringBootApplication
@EnableEurekaClient
public class MsuniversidadApigatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsuniversidadApigatewayApplication.class, args);
    }

}
