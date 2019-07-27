package com.telran.rentcompamyservice.controller;

import com.telran.rentcompamyservice.dto.ConstantsHttps;
import com.telran.rentcompamyservice.dto.Response;
import com.telran.rentcompamyservice.entities.for_calculation.RequestForGettingPrice;
import com.telran.rentcompamyservice.service.IRentCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(maxAge = 3600)
@RestController
public class ControllerRCS {
    private final String httpsUrl = "*";
    private final String allowed_headers = "*";
    private final String PERMIT_ALL = "permitAll";

    @Autowired
    IRentCompanyService iRCS;

    // ******************************calculatePrice*******************************************************************
    @CrossOrigin(origins = httpsUrl, allowedHeaders = allowed_headers)
    @PreAuthorize(PERMIT_ALL)
    @PostMapping(value = ConstantsHttps.CALCULATE_PRICE)
    Response calculatePrice(@RequestBody RequestForGettingPrice request) {
        return iRCS.calculatePrice(request);
    }

    // *******************************addJsonModelsRCS****************************************************************
    @CrossOrigin(origins = httpsUrl, allowedHeaders = allowed_headers)
    @PreAuthorize(PERMIT_ALL)
    @PostMapping(value = ConstantsHttps.ADD_JSON_MODELS_RCS)
    Response addJsonModelsRCS() {
        return iRCS.addJsonModelsRCS();
    }

    // *******************************getJsonModelsRCS****************************************************************
    @CrossOrigin(origins = httpsUrl, allowedHeaders = allowed_headers)
    @PreAuthorize(PERMIT_ALL)
    @GetMapping(value = ConstantsHttps.GET_JSON_MODELS_RCS)
    Response getJsonModelsRCS() {
        return iRCS.getJsonModelsRCS();
    }


    // ****************************addJsonLocationBranches*******************************************************
    @CrossOrigin(origins = httpsUrl, allowedHeaders = allowed_headers)
    @PreAuthorize(PERMIT_ALL)
    @PostMapping(value = ConstantsHttps.ADD_JSON_LOCATION_BRANCHES)
    Response addJsonLocationBranches() {
        return iRCS.addJsonLocationBranches();
    }

    // ****************************getJsonLocationBranches*******************************************************
    @CrossOrigin(origins = httpsUrl, allowedHeaders = allowed_headers)
    @PreAuthorize(PERMIT_ALL)
    @GetMapping(value = ConstantsHttps.GET_LOCATION_BRANCHES)
    Response getLocationBranches() {
        return iRCS.getLocationBranches();
    }


}
