package com.masivian.binarytree;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * This class is the SpringBoot Servlet config
 * @author cadolop@gmail.com
 * @version 1.0
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BinarytreeApplication.class);
	}

}
