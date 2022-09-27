package net.Abdallah.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import net.Abdallah.cms.brand.Car;

@Entity
@Table(name = "model")
public class Model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long modelId;
	
	@Transient
	private Long brandId;
	
	@Column(name = "Model", unique = true, nullable = false)
	private String model;
	
	@ManyToOne
	@JoinColumn(name = "id", nullable = false)
	private Car car;
	
	public Model() {
		
		super();
	}

	public Model(Long modelId, String model, Car car) {
		super();
		this.modelId = modelId;
		this.model = model;
		this.car = car;
	}

	public Long getModelId() {
		return modelId;
	}

	public void setModelId(Long modelId) {
		this.modelId = modelId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	
}
