package com.bitswilp.group26.cms.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bitswilp.group26.cms.dao.CMSRepo;
import com.bitswilp.group26.cms.to.Customer;

@Component
public class CMSBO {
	
	@Autowired
	CMSRepo cmsRepo;
	
	public Customer executeGetCustomer(int customerId) {
		Customer customer = cmsRepo.findById(customerId).orElse(new Customer());
		return customer;
	}

	public Customer executeUpdateCustomer(Customer customer) {
		Customer savedCustomer = cmsRepo.save(customer);
		return savedCustomer;
	}

	public void executeDeleteCustomer(Customer customer) {
		cmsRepo.deleteById(customer.getCustomerId());	
	}

	public Customer executeCreateCustomer(Customer customer) {
		Customer savedCustomer = cmsRepo.save(customer);
		return savedCustomer;
	}

	public List<Customer> executeGetAllCustomers() {
		List<Customer> customers = cmsRepo.findAll();
		return customers;
	}

}
