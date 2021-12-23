package akad2021.vakcina.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vaccine_centers")
public class VaccineCenter {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private long id;
//	private int quantity;
//	
//	@Temporal(TemporalType.DATE)
//	private Date date;
//	
//	@ManyToOne(fetch = FetchType.EAGER)
//	private ProductFromDatabase productFromDatabase;
	

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		@Column(name = "vaccine_center_name")
		private String name;
		
		@Column(name = "vaccine_center_image")
		private String imageLink;
		
		@Column(name = "vaccine_center_description")
		private String description;
		
		@Column(name = "vaccine_center_address")
		private String address;
		
		@Column(name = "vaccine_list")
		private ArrayList<Vaccine> vaccineList = new ArrayList<>();
		
		public VaccineCenter() {
			
		}

		public VaccineCenter(String name, String imageLink, String description, String address) {
			super();
			this.name = name;
			this.imageLink = imageLink;
			this.description = description;
			this.address = address;
		}

		public long getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getImageLink() {
			return imageLink;
		}

		public void setImageLink(String imageLink) {
			this.imageLink = imageLink;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
		public void addVaccine(Vaccine vaccine) {
			vaccineList.add(vaccine);
		}
		
		public int getVaccineQuantity(Vaccine vaccine) {
			return vaccine.getQuantity();
		}

	}


//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public int getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//
//	public ProductFromDatabase getProductFromDatabase() {
//		return productFromDatabase;
//	}
//
//	public void setProductFromDatabase(ProductFromDatabase productFromDatabase) {
//		this.productFromDatabase = productFromDatabase;
//	}
//
//	public Date getDate() {
//		return date;
//	}
//
//	public void setDate(Date date) {
//		this.date = date;
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		CartItem other = (CartItem) obj;
//		return id == other.id;
//	}
//	
	

