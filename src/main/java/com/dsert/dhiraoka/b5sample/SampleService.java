package com.dsert.dhiraoka.b5sample;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

    public String genMessage(String userName) {
        return "Hello " + userName;
    }
}
