package com.example.springcore.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("prototype")
@Service
public class ObjectProviderServiceImpl implements ObjectProviderService{
    public ObjectProviderServiceImpl() {
        System.out.println("ObjectProviderServiceImpl constructor : " + this);
    }

    @Override
    public void print() {
        System.out.println();
    }

    @PostConstruct
    public void init(){
        System.out.println("ObjectProviderServiceImpl init()!! : " + this);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("ObjectProviderServiceImpl destroy()!! : " + this);
    }
}
