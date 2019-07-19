package com.telran.rentcompamyservice.controller;

import com.telran.rentcompamyservice.dto.ConstantsHttps;
import com.telran.rentcompamyservice.dto.Request;
import com.telran.rentcompamyservice.dto.Response;
import com.telran.rentcompamyservice.service.RCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerRCS {

    @Autowired
    RCService rcs;

    @PostMapping(value = ConstantsHttps.CALCULATE_PRICE)
    Response calculatePrice(@RequestBody Request request){
        return rcs.calculatePrice(request);
    }

}
