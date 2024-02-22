package com.springproject.emsbackend.mapper;

import com.springproject.emsbackend.dto.FamilyMemberDTO;
import com.springproject.emsbackend.model.FamilyMember;

public class FamilyMemberMapper {
    public static FamilyMemberDTO mapToFamilyMemberDTO(FamilyMember familyMember){
        return new FamilyMemberDTO(
                familyMember.getId(),
                familyMember.getPrimaryCustomer(),
                familyMember.getFamilyMember()
        );
    }

    public static FamilyMember mapToFamilyMember(FamilyMemberDTO familyMemberDTO){
        return new FamilyMember(
                familyMemberDTO.getId(),
                familyMemberDTO.getPrimaryCustomer(),
                familyMemberDTO.getFamilyMember()
        );
    }
}
