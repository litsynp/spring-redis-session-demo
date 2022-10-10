package com.litsynp.redissession.interfaces.controller

import com.litsynp.redissession.application.MemberService
import com.litsynp.redissession.interfaces.request.MemberRegisterRequest
import com.litsynp.redissession.interfaces.response.MemberView
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/members")
class MemberController(
    private val memberService: MemberService,
) {
    @PostMapping("/register")
    fun register(@RequestBody request: MemberRegisterRequest): ResponseEntity<MemberView> {
        val member = memberService.register(request.email, request.password)
        return ResponseEntity(
            MemberView.of(member),
            HttpStatus.CREATED
        )
    }
}
