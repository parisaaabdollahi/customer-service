package org.microservice.customerservice.repository;

import org.microservice.customerservice.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {


}
