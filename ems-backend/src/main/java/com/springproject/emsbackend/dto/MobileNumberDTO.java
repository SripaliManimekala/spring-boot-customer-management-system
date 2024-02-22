package com.springproject.emsbackend.dto;

import com.springproject.emsbackend.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MobileNumberDTO {
    private Long id;
    private Customer customer;
    private String mobileNumber;
}
