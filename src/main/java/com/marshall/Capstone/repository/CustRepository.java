package com.marshall.Capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marshall.Capstone.model.Customer;

@Repository

public interface CustRepository extends JpaRepository<Customer, Long> {

}

