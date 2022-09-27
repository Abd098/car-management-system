package net.Abdallah.cms.brand;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BrandController {
	
	@Autowired
	private BrandService brandService;
	
	@RequestMapping("/index")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("/showBrands")
	public String showBrands(Model model) {
		
		List<Car> listCars = brandService.getAllCarBrands();
		model.addAttribute("listCars", listCars);
		
		return "showBrands";
	}
	
	@RequestMapping("/redirectToShowBrands")
	public String redirectToShowBrands() {
		
		return "redirect:showBrands";
	}
	
}
