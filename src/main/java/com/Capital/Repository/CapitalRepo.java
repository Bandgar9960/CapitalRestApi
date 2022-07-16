package com.Capital.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Capital.Entity.Capital;

public interface CapitalRepo extends JpaRepository<Capital, Integer> {
	
     List<Capital> findByCountryName(String countryName);

}
