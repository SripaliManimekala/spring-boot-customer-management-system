package com.springproject.emsbackend.mapper;

import com.springproject.emsbackend.dto.NICImageDTO;
import com.springproject.emsbackend.model.NICImage;

public class NICImageMapper {
    public static NICImageDTO mapToNICImageDTO(NICImage nicImage){
        return new NICImageDTO(
                nicImage.getId(),
                nicImage.getCustomer(),
                nicImage.getImage()
        );
    }
    public static NICImage mapToNICImage(NICImageDTO nicImageDTO){
        return new NICImage(
                nicImageDTO.getId(),
                nicImageDTO.getCustomer(),
                nicImageDTO.getImage()
        );
    }
}
