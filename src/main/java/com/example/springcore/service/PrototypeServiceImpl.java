package com.example.springcore.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("prototype")
@Service
public class PrototypeServiceImpl implements LifeCycleService{
    public PrototypeServiceImpl() {
        System.out.println("PrototypeServiceImpl constructor : " + this);
    }

    @Override
    public void print() {
        System.out.println();
    }

    @PostConstruct
    public void init(){
        System.out.println("PrototypeServiceImpl init()!! : " + this);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("PrototypeServiceImpl destroy()!! : " + this);
    }
}
