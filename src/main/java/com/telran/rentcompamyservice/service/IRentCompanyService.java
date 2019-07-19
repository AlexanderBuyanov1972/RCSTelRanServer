package com.telran.rentcompamyservice.service;

import com.telran.rentcompamyservice.entities.Response;
import com.telran.rentcompamyservice.entities.Order;
import com.telran.rentcompamyservice.entities.User;

public interface IRentCompanyService {
    Response login(User user);
    Response loguot();

    Response createOrder(Order order);
    Response updateOrder(Order order);
    Response deleteOrder(Long id);
    Response getOrder(Long id);
    Response getVoucherFromEmail(Long id);

    Response getPricesJsonFromSiteVendor();
    Response getPriceFromJPricesJson();

    Response getAllCategories();
    Response getListBranches();
    Response calculatePriceOrder();


}
