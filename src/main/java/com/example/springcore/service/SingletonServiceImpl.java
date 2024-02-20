package com.example.springcore.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class SingletonServiceImpl implements LifeCycleService{
    public SingletonServiceImpl() {
        System.out.println("SingletonServiceImpl constructor : " + this);
    }

    @Override
    public void print() {
        System.out.println();
    }

    @PostConstruct
    public void init(){
        System.out.println("SingletonServiceImpl init()!! : " + this);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("SingletonServiceImpl destroy()!! " + this);
    }
}
