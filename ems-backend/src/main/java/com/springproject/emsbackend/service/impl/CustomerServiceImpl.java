package com.springproject.emsbackend.service.impl;

import com.springproject.emsbackend.dto.CustomerDTO;
import com.springproject.emsbackend.mapper.CustomerMapper;
import com.springproject.emsbackend.model.Customer;
import com.springproject.emsbackend.repository.CustomerRepository;
import com.springproject.emsbackend.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {


    private CustomerRepository customerRepository;

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {


        Customer customer = CustomerMapper.mapToCustomer(customerDTO);
        //save to database
        Customer savedCustomer = customerRepository.save(customer);

        return CustomerMapper.mapToCustomerDTO(savedCustomer);
    }
}
