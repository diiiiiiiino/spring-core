package com.example.springcore.controller;

import com.example.springcore.service.LifeCycleService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Scope("prototype")
@RestController
public class PrototypeController {
    private final LifeCycleService lifeCycleService;

    public PrototypeController(LifeCycleService prototypeServiceImpl) {
        this.lifeCycleService = prototypeServiceImpl;
        System.out.println("PrototypeController constructor" + this);
    }

    @GetMapping("/prototype")
    public String prototype(){

        return "ok";
    }

    @PostConstruct
    public void init(){
        System.out.println("PrototypeController init()!! : " + this);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("PrototypeController destroy()!! : " + this);
    }
}
