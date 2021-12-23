package akad2021.vakcina.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class Vaccine {
		
	private String manufacturer;
	
	private String name;
	
	private String description;
	
	private int quantity = 0;
	
	
	public Vaccine() {
		
	}

	public Vaccine(String manufacturer, String name, String description, String productContent, int quantity) {
		super();
		this.manufacturer = manufacturer;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
