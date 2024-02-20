package com.example.springcore.config;

import com.example.springcore.repository.MemberRepository;
import com.example.springcore.repository.MemoryMemberRepository;
import com.example.springcore.service.DiscountPolicy;
import com.example.springcore.service.FixDiscountPolicy;
import com.example.springcore.service.MemberService;
import com.example.springcore.service.MemberServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
