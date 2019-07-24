package com.telran.rentcompamyservice.service;

import com.telran.rentcompamyservice.dto.Response;
import com.telran.rentcompamyservice.entities.Order;
import com.telran.rentcompamyservice.entities.User;
import com.telran.rentcompamyservice.entities.for_calculation.RequestForGettingPrice;

public interface IRentCompanyService {
    Response addJsonModelsRCS();
    Response getJsonModelsRCS();
    Response addJsonLocationBranches();
    Response getJsonLocationBranches();
    Response calculatePrice(RequestForGettingPrice request);


//    Response login(User user);
//    Response loguot();
//
//    Response createOrder(Order order);
//    Response updateOrder(Order order);
//    Response deleteOrder(Long id);
//    Response getOrder(Long id);
//    Response getVoucherFromEmail(Long id);
//
//    Response getPricesJsonFromSiteVendor();
//    Response getPriceFromJPricesJson();
//
//    Response getAllCategories();
//    Response getListBranches();
//    Response calculatePriceOrder();




}
