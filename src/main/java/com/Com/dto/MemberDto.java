package com.Com.dto;

import com.Com.domain.entity.Member;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberDto {

    private Long id;
    private String username;
    private String password;
    private String name;
    private String address;
    private String date;
    private String gender;
    private String phone;
    private String email;



    @Builder
    public MemberDto(Long id, String username, String password, String name, String address, String date, String gender, String phone, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.address = address;
        this.date = date;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }

    public Member toEntity() {
        Member member = Member.builder()
                .id(id)
                .username(username)
                .password(password)
                .name(name)
                .address(address)
                .date(date)
                .gender(gender)
                .phone(phone)
                .email(email)
                .build();
        return member;
    }
}
