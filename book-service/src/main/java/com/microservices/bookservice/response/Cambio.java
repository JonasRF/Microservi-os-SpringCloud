package com.microservices.bookservice.response;

import java.io.Serializable;
import java.math.BigDecimal;

public class Cambio implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;

	private String from;
	
	private String to;
	
	private Double conversionFactor;
	
	private Double convertedValue;
	
	private String enviromment;
	
	public Cambio () {
		
	}

	public Cambio(Long id, String from, String to, Double conversionFactor, Double convertedValue,
			String enviromment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionFactor = conversionFactor;
		this.convertedValue = convertedValue;
		this.enviromment = enviromment;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public Double getConversionFactor() {
		return conversionFactor;
	}


	public void setConversionFactor(Double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}


	public Double getConvertedValue() {
		return convertedValue;
	}


	public void setConvertedValue(Double convertedValue) {
		this.convertedValue = convertedValue;
	}


	public String getEnviromment() {
		return enviromment;
	}

	public void setEnviromment(String enviromment) {
		this.enviromment = enviromment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cambio other = (Cambio) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
