package com.codegym.customermanagement.repository;

import java.util.List;

public interface ICustomerRepository<T> {
    List<T> findAll();
    T findById(int id);
    void save(T t);
    void remove(Long id);
}
