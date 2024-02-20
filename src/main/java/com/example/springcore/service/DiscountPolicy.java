package com.example.springcore.service;

import com.example.springcore.entity.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
