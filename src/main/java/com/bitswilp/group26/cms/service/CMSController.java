package com.bitswilp.group26.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bitswilp.group26.cms.bl.CMSBO;
import com.bitswilp.group26.cms.to.Customer;


@RestController
public class CMSController {
	
	@Autowired
	private CMSBO cmsBo;
	
	
	@GetMapping("customers")
	public List<Customer> getCustomers() {
		List<Customer> customers = cmsBo.executeGetAllCustomers();
		return customers;
	};
	
	@GetMapping("customer")
	public Customer getCustomer(@RequestParam("customerId") String customerId) {
		Customer customer = cmsBo.executeGetCustomer(Integer.parseInt(customerId));
		return customer;
	};
	
	
	@PostMapping("customer")
	public Customer createCustomer(@RequestBody Customer customer) {
		Customer savedCustomer = cmsBo.executeCreateCustomer(customer);
		return savedCustomer;
	};
	
	
	@PutMapping("customer")
	public Customer updateOrder(@RequestBody Customer customer) {
		Customer updatedOrder = cmsBo.executeUpdateCustomer(customer);
		return updatedOrder;
	};
	
	
	@DeleteMapping("customer")
	public String deleteOrder(@RequestBody Customer customer) {
		cmsBo.executeDeleteCustomer(customer);
		return "Deleted!";
	};
	

}
