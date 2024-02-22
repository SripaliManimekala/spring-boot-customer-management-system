package com.springproject.emsbackend.mapper;

import com.springproject.emsbackend.dto.CustomerDTO;
import com.springproject.emsbackend.model.Customer;

public class CustomerMapper {

    public static CustomerDTO mapToCustomerDTO(Customer customer){
        return new CustomerDTO(
                customer.getId(),
                customer.getName(),
                customer.getDateOfBirth(),
                customer.getNicNumber()
        );
    }

    public static Customer mapToCustomer(CustomerDTO customerDTO){
        return new Customer(
                customerDTO.getId(),
                customerDTO.getName(),
                customerDTO.getDateOfBirth(),
                customerDTO.getNicNumber()
        );
    }
}
