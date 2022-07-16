package com.Capital.Service;

import java.util.List;

import com.Capital.Entity.Capital;

public interface CapitalService {

	Capital CreateCountry(Capital capital);

	List<Capital> getAllCountries();

	Capital getCountryById(Integer capitalId);

	List<Capital> getCountryByName(String countryName);

	Capital updateCountry(Capital capital, Integer capitalId);

	void deteleCountry(Integer capitalId);

}
