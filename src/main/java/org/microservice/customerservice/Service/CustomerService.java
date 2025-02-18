package org.microservice.customerservice.Service;

import jakarta.transaction.Transactional;
import org.microservice.customerservice.entity.CustomerEntity;
import org.microservice.customerservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional
    public CustomerEntity save(CustomerEntity customerEntity) {
        return customerRepository.save(customerEntity);
    }

    @Transactional
    public List<CustomerEntity> findAll() {
        return customerRepository.findAll();
    }
}
