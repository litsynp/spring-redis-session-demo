package com.litsynp.redissession.interfaces.response

import com.litsynp.redissession.domain.Member

class MemberView(
    val id: Long,
    val email: String,
) {
    companion object {
        fun of(member: Member): MemberView {
            return MemberView(
                id = member.id!!,
                email = member.email,
            )
        }
    }
}
