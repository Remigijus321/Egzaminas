package akad2021.vakcina.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import akad2021.vakcina.model.Vaccine;
import akad2021.vakcina.model.VaccineFromDatabase;
import akad2021.vakcina.model.VaccineFromService;
import akad2021.vakcina.service.VaccineService;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api")
public class VaccineController {

	@Autowired
	private VaccineService vaccineService;

	public VaccineService getVaccineService() {
		return vaccineService;
	}

	public void setVaccineService(VaccineService vaccineService) {
		this.vaccineService = vaccineService;
	}
	
	@GetMapping("vaccines")
	public List<VaccineFromDatabase> getVaccines() {
		return vaccineService.getVaccines();
	}
	
	@PostMapping("vaccines")
	public String createVaccine(@RequestBody Vaccine vaccine) {
		return vaccineService.createVaccine(new VaccineFromService(vaccine.getManufacturer(), vaccine.getName(),
				vaccine.getDescription(), vaccine.getQuantity()));
	}
	 
	@GetMapping("vaccines/{id}")
	public VaccineFromDatabase findVaccineById(@PathVariable(name = "id") long id) {
		return vaccineService.findVaccineById(id);
	}
	
	@PutMapping("vaccines/{id}")
	public String updateVaccineById(@PathVariable(name = "id") long id, @RequestBody Vaccine vaccineDetails) {
		return vaccineService.updateVaccineById(id, new VaccineFromService(vaccineDetails.getManufacturer(),
				vaccineDetails.getName(), vaccineDetails.getDescription(), vaccineDetails.getQuantity()));
	}

	@DeleteMapping("vaccines/{id}")
	public String deleteproductById(@PathVariable(name = "id") long id) {
		return vaccineService.deleteVaccineById(id);
	}
}
