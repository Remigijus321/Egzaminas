package akad2021.vakcina.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vaccines")
public class VaccineFromService{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "vaccine_manufacturer")
	private String manufacturer;
	
	@Column(name = "vaccine_name")
	private String name;
	
	@Column(name = "vaccine_description")
	private String description;
	
	@Column(name = "vaccine_count")
	private int quantity = 0;
	
	public VaccineFromService() {
		
	}

	public VaccineFromService(String manufacturer, String name, String description, int quantity) {
		super();
		this.manufacturer = manufacturer;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
