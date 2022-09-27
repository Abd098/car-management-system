package net.Abdallah.cms.brand;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import net.Abdallah.cms.model.Model;

@Entity
@Table(name = "brand")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Brand", unique = true, nullable = false)
	private String brand;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "brand_id", referencedColumnName = "id")
	private List<Model> carModels = new ArrayList<Model>();
	
	public Car() {
		
	}

	public Car(Long id, String brand) {
		super();
		this.id = id;
		this.brand = brand;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public List<Model> getCarModels() {
		return carModels;
	}

	public void setCarModels(List<Model> carModels) {
		this.carModels = carModels;
	}
	
}
