package br.com.simplespringdatareactivewithcassandra.web;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.simplespringdatareactivewithcassandra.model.Customer;
import br.com.simplespringdatareactivewithcassandra.service.CustomerService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/")
	public String hello() {
	  // retrieve all
	  return "Test";
	}
	
	@GetMapping("/findAll")
	public Flux<Customer> getAll() {
	  
	  // retrieve all
	  return customerService.findAll();
	}
	 
	@GetMapping("/{id}")
	public Mono<Customer> getCustomerById(@PathVariable UUID id) {
	  
	  // find by id
	  return customerService.findById(id);
	}
}
