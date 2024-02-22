package com.springproject.emsbackend.repository;

import com.springproject.emsbackend.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
