package com.disaster.ds_gateway.config

import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.cloud.gateway.route.builder.routes
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Declares the Routes to the different services and any modification and filtering that
 * needs to be done to either the request body / response body happens here.
 * @author FaisalDev
 */
@Configuration
class GatewayRoutesConfig {


    // this function creates for us a custom route locator that will
    // forward our request and responses to the correct address points.
    @Bean
    fun disaterAppCustomRouteLocator(builder: RouteLocatorBuilder): RouteLocator {
        return builder.routes {
            // declare other routes as Such (I'M USING KOTLIN)
            route("user_svc_route") {
                this@route.path("/api/v1/user/**")
                    .uri("lb://DS-USER-SERVICE")
            }
            // example Ends here
        }
    }


}