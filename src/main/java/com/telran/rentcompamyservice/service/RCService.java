package com.telran.rentcompamyservice.service;

import com.telran.rentcompamyservice.dto.Request;
import com.telran.rentcompamyservice.dto.Response;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RCService {
    private int goodCode = 200;
    private String currentDate = LocalDateTime.now().toString();
    private Response response = null;

    public Response calculatePrice(Request request){
        response = new Response().setCode(goodCode).setTimestamp(currentDate);
        System.out.println("request.getName1()-------------------->" + request.getName1());
        System.out.println("request.getName2()-------------------->" + request.getName2());
        System.out.println("request.getName3()-------------------->" + request.getName3());
        return response.setContent(request.getName1() + request.getName2() + request.getName3())
                .setMessage("OK");
    }
}