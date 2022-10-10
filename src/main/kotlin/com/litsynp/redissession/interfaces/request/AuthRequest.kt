package com.litsynp.redissession.interfaces.request

data class MemberRegisterRequest(
    val email: String,
    val password: String,
)
