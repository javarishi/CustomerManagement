package com.bitswilp.group26.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitswilp.group26.cms.to.Customer;


public interface CMSRepo extends JpaRepository<Customer, Integer> {

}
