package com.springproject.emsbackend.dto;

import com.springproject.emsbackend.model.City;
import com.springproject.emsbackend.model.Country;
import com.springproject.emsbackend.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {
    private Long id;
    private Customer customer;
    private String addressLine1;
    private String addressLine2;
    private City city;
    private Country country;
}
