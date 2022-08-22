package com.healthmax.domain;

import com.healthmax.dto.MemberRegistDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "member")
public class Member extends BaseTimeEntity{

    @Id @GeneratedValue
    private Long id;

    private String password;

    private String nickNm;

    private String name;

    private String email;

    @Enumerated(EnumType.STRING)
    private MemberRole memberRole;

    public static Member createMember(MemberRegistDTO memberRegistDTO){

        Member member = new Member();
        member.setName(memberRegistDTO.getName());
        member.setEmail(memberRegistDTO.getEmail());
        member.setPassword(memberRegistDTO.getPassword());
        member.setNickNm(memberRegistDTO.getNickNm());
        member.setMemberRole(MemberRole.USER);
        return member;
    }
}
