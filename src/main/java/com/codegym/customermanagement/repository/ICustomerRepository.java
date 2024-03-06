package com.codegym.customermanagement.repository;

import com.codegym.customermanagement.model.Customer;
import com.codegym.customermanagement.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends CrudRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> findAllByFirstNameContaining(Pageable pageable, String name);
}
