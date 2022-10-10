package com.litsynp.redissession.interfaces.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpSession

@RestController
class HelloController {

    @GetMapping("/hello")
    fun hello(session: HttpSession): String {
        session.setAttribute("hello", "litsynp")
        return "hello litsynp"
    }
}
