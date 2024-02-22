package com.springproject.emsbackend.mapper;

import com.springproject.emsbackend.dto.MobileNumberDTO;
import com.springproject.emsbackend.model.MobileNumber;

public class MobileNumberMapper {
    public static MobileNumberDTO mapToMobileNumberDTO(MobileNumber mobileNumber){
        return new MobileNumberDTO(
                mobileNumber.getId(),
                mobileNumber.getCustomer(),
                mobileNumber.getMobileNumber()
        );
    }

    public static MobileNumber mapToMobileNumber(MobileNumberDTO mobileNumberDTO){
        return new MobileNumber(
                mobileNumberDTO.getId(),
                mobileNumberDTO.getCustomer(),
                mobileNumberDTO.getMobileNumber()
        );
    }
}
