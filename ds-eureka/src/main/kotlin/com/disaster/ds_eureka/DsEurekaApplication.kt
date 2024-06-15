package com.disaster.ds_eureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class DsEurekaApplication

fun main(args: Array<String>) {
	runApplication<DsEurekaApplication>(*args)
}
