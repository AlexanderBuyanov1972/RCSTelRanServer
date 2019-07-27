package com.telran.rentcompamyservice.service;

import com.telran.rentcompamyservice.dto.Response;
import com.telran.rentcompamyservice.entities.for_calculation.RequestForGettingPrice;

public interface IRentCompanyService {
    Response addJsonModelsRCS();

    Response getJsonModelsRCS();

    Response addJsonLocationBranches();

    Response getLocationBranches();

    Response calculatePrice(RequestForGettingPrice request);


}
