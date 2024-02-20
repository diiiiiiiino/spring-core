package com.example.springcore.service;

import com.example.springcore.entity.Member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
