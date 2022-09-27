package net.Abdallah.cms.model;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class ModelController {
	
	@Autowired
	private ModelService modelService;
	
	@RequestMapping("/showBrands/{modelId}/showModels")
	public String showModels(Model model, @PathVariable("modelId") Long id) {
		
		List<net.Abdallah.cms.model.Model> listModels = modelService.getAllModels(id);
		model.addAttribute("listModels", listModels);
		
		return "showModels";
	}
	
	@RequestMapping("/redirectToShowModels")
	public String redirectToShowModels() {
		
		return "redirect:showModels";
	}

}
