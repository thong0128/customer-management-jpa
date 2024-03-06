package com.codegym.customermanagement.service;

import com.codegym.customermanagement.model.Customer;
import com.codegym.customermanagement.model.Province;
import com.codegym.customermanagement.service.IGenerateService;

public interface ICustomerService extends IGenerateService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
