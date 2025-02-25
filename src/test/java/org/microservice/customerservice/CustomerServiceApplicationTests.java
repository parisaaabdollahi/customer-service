package org.microservice.customerservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.microservice.customerservice.entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
/*@Testcontainers
@AutoConfigureMockMvc*/
class CustomerServiceApplicationTests {

/*    @Container
    static PostgreSQLContainer postgreSQLContainer = (PostgreSQLContainer) new PostgreSQLContainer("postgres:13-alpine");

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @DynamicPropertySource
    static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry) {
        dynamicPropertyRegistry.add("spring.data.postgres.url", postgreSQLContainer::getJdbcUrl);

    }

    @Test
    void shouldCreateCustomer() throws Exception {
     CustomerEntity customerEntity= getCustomerEntry();
     String customerString = objectMapper.writeValueAsString(customerEntity);
        mockMvc.perform(MockMvcRequestBuilders.post("/customer/create")
                .contentType(MediaType.APPLICATION_JSON)
        .content(customerString))
                .andExpect(status().isCreated());
    }

    private CustomerEntity getCustomerEntry() {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setFirstName("Amir");
        customerEntity.setLastName("Khalighi");
        customerEntity.setEmail("amir.khalighi@gmail.com");
        return customerEntity;
    }*/
}
