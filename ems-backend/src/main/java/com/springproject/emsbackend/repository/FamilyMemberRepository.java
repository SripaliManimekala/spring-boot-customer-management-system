package com.springproject.emsbackend.repository;

import com.springproject.emsbackend.model.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyMemberRepository extends JpaRepository<FamilyMember, Long> {

}
