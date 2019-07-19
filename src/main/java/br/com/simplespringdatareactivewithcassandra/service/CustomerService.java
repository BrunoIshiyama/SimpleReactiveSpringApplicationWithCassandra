package br.com.simplespringdatareactivewithcassandra.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.simplespringdatareactivewithcassandra.model.Customer;
import br.com.simplespringdatareactivewithcassandra.repository.ReactiveCustomerRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerService {
	
	@Autowired
	private ReactiveCustomerRepository customerRepository;

	
	public Flux<Customer> findAll(){
		return customerRepository.findAll();
	}
	
	public Mono<Customer> findById(UUID id) {
		return customerRepository.findById(id);
	}
}
