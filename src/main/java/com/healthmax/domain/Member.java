package com.healthmax.domain;

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

}
