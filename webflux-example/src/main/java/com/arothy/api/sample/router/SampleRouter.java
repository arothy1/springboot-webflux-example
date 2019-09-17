package com.arothy.api.sample.router;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.arothy.api.sample.handler.SampleHandler;

@Configuration
public class SampleRouter {

	@Bean RouterFunction<ServerResponse> routeSample(SampleHandler sampleHandler) {
		return RouterFunctions
				.route(RequestPredicates
							.GET("/")
							.and(RequestPredicates.accept(MediaType.TEXT_PLAIN)
				), sampleHandler::helloWorld);
	}
}
