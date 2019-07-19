package br.com.simplespringdatareactivewithcassandra.repository;

import java.util.UUID;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

import br.com.simplespringdatareactivewithcassandra.model.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Repository
public interface ReactiveCustomerRepository extends ReactiveCassandraRepository<Customer, Long> {

	@Query("SELECT * FROM customer WHERE first_name = ?0 and last_name  = ?1 ALLOW FILTERING")
	Mono<Customer> findByFirstnameAndLastname(String firstname, String lastname);

	@Query("SELECT * FROM customer WHERE age = ?0 ALLOW FILTERING")
	Flux<Customer> findByAge(Mono<Integer> age);

	@Query("SELECT * FROM customer")
	Flux<Customer> findAll();
	
	@Query("SELECT * FROM customer WHERE id = ?0 ALLOW FILTERING")
	Mono<Customer> findById(UUID id);
}
