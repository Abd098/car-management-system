package net.Abdallah.cms.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {

	@Autowired
	private ModelRepository modelRepository;
	
public List<Model> getAllModels(Long brandId) {
		
		List<Model> models = new ArrayList<>();
		modelRepository.findByCarId(brandId)
		.forEach(models::add);
		return models;
	}
}
