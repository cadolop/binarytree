package com.masivian.binarytree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * This class is the SpringBoot config
 * @author cadolop@gmail.com
 * @version 1.0
 *
 */
@SpringBootApplication
@Import(SwaggerConfiguration.class)
public class BinarytreeApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(BinarytreeApplication.class, args);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
	}

}