package com.healthmax.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberRegistDTO {

    private String email; //회원 이메일

    private String name; //회원 이름

    private String nickNm;

    private String password; //회원 비밀번호

}
