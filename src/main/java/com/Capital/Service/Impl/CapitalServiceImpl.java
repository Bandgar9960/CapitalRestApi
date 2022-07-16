package com.Capital.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Capital.Entity.Capital;
import com.Capital.Repository.CapitalRepo;
import com.Capital.Service.CapitalService;

@Service
public class CapitalServiceImpl implements CapitalService {
    
	@Autowired
	private CapitalRepo capitalRepo;

	@Override
	public Capital CreateCountry(Capital capital) {

		Capital saveCapital = capitalRepo.save(capital);

		return saveCapital;
	}

	@Override
	public List<Capital> getAllCountries() {

		List<Capital> allCountry = capitalRepo.findAll();

		return allCountry;
	}

	@Override
	public Capital getCountryById(Integer capitalId) {
		Capital capital = capitalRepo.findById(capitalId).get();
		return capital;
	}

	@Override
	public List<Capital> getCountryByName(String countryName) {

		List<Capital> CountryName = capitalRepo.findByCountryName(countryName);

		return CountryName;
	}

	@Override
	public Capital updateCountry(Capital capital, Integer capitalId) {

		Capital capital2 = capitalRepo.findById(capitalId).get();

		capital2.setCapitalName(capital.getCapitalName());
		capital2.setCountryName(capital.getCountryName());

		Capital savecapital = capitalRepo.save(capital2);

		return savecapital;
	}

	@Override
	public void deteleCountry(Integer capitalId) {

		Capital capital = capitalRepo.findById(capitalId).get();
		capitalRepo.delete(capital);

	}

}
