package com.springFrameMicroServices.brewery.breweryArt.services;

import com.springFrameMicroServices.brewery.breweryArt.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .customerName("Jim Rozos")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        log.debug("Customer with id: {} saved", customerDto.getId().toString());
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("Customer with id: {} updated", customerDto.getId().toString());
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("Customer with id: {} deleted", customerId.toString());
    }


}
