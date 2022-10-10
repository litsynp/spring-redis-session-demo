package com.litsynp.redissession

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringRedisSessionDemoApplication

fun main(args: Array<String>) {
	runApplication<SpringRedisSessionDemoApplication>(*args)
}
