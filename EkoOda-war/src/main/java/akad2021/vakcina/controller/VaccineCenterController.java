package akad2021.vakcina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import akad2021.vakcina.model.VaccineCenter;
import akad2021.vakcina.service.VaccineCenterService;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api")
public class VaccineCenterController {
	
	@Autowired
	private VaccineCenterService vaccineCenterService;
	
	public VaccineCenterService getVaccineCenterService() {
		return vaccineCenterService;
	}

	public void setVaccineCenterService(VaccineCenterService vaccineCenterService) {
		this.vaccineCenterService = vaccineCenterService;
	}

	@GetMapping("centers")
	public List<VaccineCenter> getVaccineCenters() {
		return vaccineCenterService.getVaccineCenters();
	}
	
	@PostMapping("centers")
	public String addVaccineCenter(@RequestBody VaccineCenter vaccineCenter) {
		return vaccineCenterService.addCenter(vaccineCenter);
	}
	
	@GetMapping("centers/{id}")
	public VaccineCenter findVaccineCentersById(@PathVariable(name = "id") long id) {
		return vaccineCenterService.findVaccineCenterById(id);
	}
	
	@DeleteMapping("centers/{id}")
	public String deleteVaccineCentersById(@PathVariable(name = "id") long id) {
		return vaccineCenterService.deleteVaccineCenterById(id);
	}
}
