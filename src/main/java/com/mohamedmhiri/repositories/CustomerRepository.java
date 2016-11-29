package com.mohamedmhiri.repositories;

import java.util.List;
import com.mohamedmhiri.entities.Customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}