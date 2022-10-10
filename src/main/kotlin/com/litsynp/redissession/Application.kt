package com.litsynp.redissession

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession

@SpringBootApplication
@EnableRedisHttpSession
class SpringRedisSessionDemoApplication

fun main(args: Array<String>) {
    runApplication<SpringRedisSessionDemoApplication>(*args)
}
