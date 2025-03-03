package org.microservice.customerservice.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(schema = "customer_service",name = "customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
}
