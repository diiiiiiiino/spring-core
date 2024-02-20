package com.example.springcore.service;

import com.example.springcore.entity.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {
    //private final ObjectProvider<MyLogger> myLoggerProvider;
    private final MyLogger myLogger;

    public void logic(String id){
        //MyLogger myLogger = myLoggerProvider.getObject();

        myLogger.log("service id = " + id);
    }
}
