package com.Capital.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CAPITAL")
@Data
public class Capital {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CAPITAL_ID")
	private Integer capitalId;
	
	@Column(name = "COUNTRY_NAME")
	private String countryName;
	
	@Column(name = "CAPITAL_NAME")
	private String capitalName;

}
