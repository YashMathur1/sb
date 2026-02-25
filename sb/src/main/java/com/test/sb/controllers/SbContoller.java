package com.test.sb.controllers;

import com.test.sb.Exceptions.NoRecordFoundException;
import org.apache.logging.log4j.util.InternalException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SbContoller {

    @GetMapping("/status")
    public String getHello(){
//        if(true) {
//            throw new InternalException("In Ex");
//        }
        return "Application Working fine...";
    }
}
