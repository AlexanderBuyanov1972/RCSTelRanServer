package com.telran.rentcompamyservice.controller;

import com.telran.rentcompamyservice.dto.ConstantsHttps;
import com.telran.rentcompamyservice.dto.Request;
import com.telran.rentcompamyservice.dto.Response;
import com.telran.rentcompamyservice.service.RCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin( maxAge = 3600)
@RestController
public class ControllerRCS {
    private final String httpsUrl = "*";
    private final String allowed_headers = "*";
    private final String PERMIT_ALL = "permitAll";

    @Autowired
    RCService rcs;
    @CrossOrigin(origins = httpsUrl, allowedHeaders = allowed_headers)
    @PreAuthorize(PERMIT_ALL)
    @PostMapping(value = ConstantsHttps.CALCULATE_PRICE)
    Response calculatePrice(@RequestBody Request request){
        return rcs.calculatePrice(request);
    }

}
