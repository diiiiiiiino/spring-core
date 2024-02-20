package com.example.springcore.repository;

import com.example.springcore.entity.Member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
