package com.Capital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Capital.Entity.Capital;
import com.Capital.Service.CapitalService;

@RestController
@RequestMapping("/capitals")
public class CapitalController {
    
	@Autowired
	private CapitalService capitalService;

	@PostMapping("/create")
	public ResponseEntity<Capital> createCapital(@RequestBody Capital capital) {

		Capital country = capitalService.CreateCountry(capital);

		return new ResponseEntity<Capital>(country, HttpStatus.CREATED);

	}

	@GetMapping("/")
	public ResponseEntity<List<Capital>> getAllCountry() {

		List<Capital> countries = capitalService.getAllCountries();

		return new ResponseEntity<List<Capital>>(countries, HttpStatus.OK);

	}

	@GetMapping("/get/{capitalId}")
	public ResponseEntity<Capital> getCountryById(@PathVariable Integer capitalId) {

		Capital getCountry = capitalService.getCountryById(capitalId);
		return new ResponseEntity<Capital>(getCountry, HttpStatus.OK);

	}

	@GetMapping("/{countryName}")
	public ResponseEntity<List<Capital>> getCountryByName(@PathVariable String countryName) {

		List<Capital> countryByName = capitalService.getCountryByName(countryName);
		return new ResponseEntity<List<Capital>>(countryByName, HttpStatus.OK);

	}

	@PutMapping("/update/{capitalId}")
	public ResponseEntity<Capital> updateCountry(@RequestBody Capital capital, @PathVariable Integer capitalId) {

		Capital updateCountry = capitalService.updateCountry(capital, capitalId);

		return new ResponseEntity<Capital>(updateCountry, HttpStatus.CREATED);

	}

	@DeleteMapping("/delete/{capitalId}")
	public ResponseEntity<String> deleteCountry(@PathVariable Integer capitalId) {

		capitalService.deteleCountry(capitalId);

		return new ResponseEntity<String>("Country Deleted SucessFully", HttpStatus.OK);

	}

}
