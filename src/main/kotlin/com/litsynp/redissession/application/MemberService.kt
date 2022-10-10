package com.litsynp.redissession.application

import com.litsynp.redissession.domain.Member
import com.litsynp.redissession.domain.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberRepository: MemberRepository,
) {
    fun register(email: String, password: String): Member {
        if (memberRepository.findByEmail(email) != null) {
            throw RuntimeException("Member with the email already exists")
        }
        return memberRepository.save(Member(email, password))
    }
}
