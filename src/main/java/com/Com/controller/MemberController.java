package com.Com.controller;

import com.Com.dto.MemberDto;
import com.Com.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/")
    public String main() {
        return "/main";
    }

    // 회원가입
    @GetMapping("/join")
    public String join() {
        return "/memberJoin";
    }

    // 회원가입 처리
    @PostMapping("/userJoin")
    public String Sign(MemberDto memberDto) {
        memberService.joinUser(memberDto);

        return "redirect:/login";
    }

    // 로그인
    @GetMapping("/login")
    public String login() {
        return "/memberLogin";
    }

    @GetMapping("/user/login/result")
    public String dispLoginResult() {
        return "/loginSuccess";
    }




    /*
    // 마이페이지
    @GetMapping("/myQnaMain")
    public String goMyPage() {
        return "/"
    }

     */
}
