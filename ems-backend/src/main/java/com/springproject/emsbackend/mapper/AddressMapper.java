package com.springproject.emsbackend.mapper;

import com.springproject.emsbackend.dto.AddressDTO;
import com.springproject.emsbackend.model.Address;

public class AddressMapper {
    public static AddressDTO mapToAddressDTO(Address address){
        return new AddressDTO(
                address.getId(),
                address.getCustomer(),
                address.getAddressLine1(),
                address.getAddressLine2(),
                address.getCity(),
                address.getCountry()
        );
    }
    public static Address mapToAddress(AddressDTO addressDTO){
        return new Address(
                addressDTO.getId(),
                addressDTO.getCustomer(),
                addressDTO.getAddressLine1(),
                addressDTO.getAddressLine2(),
                addressDTO.getCity(),
                addressDTO.getCountry()
        );
    }
}
