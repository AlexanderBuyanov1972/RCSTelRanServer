package com.telran.rentcompamyservice.service;

import com.telran.rentcompamyservice.dto.Response;
import com.telran.rentcompamyservice.entities.calculation.RequestForGettingPrice;

public interface IRentCompanyService {
    Response addJsonModelsRCS();
    Response addJsonLocationBranches();

    Response getJsonModelsRCS();
    Response getJsonLocationBranches();

    Response calculatePrice(RequestForGettingPrice request);


}
