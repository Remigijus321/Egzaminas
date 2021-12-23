package akad2021.vakcina.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import akad2021.vakcina.model.VaccineCenter;
import akad2021.vakcina.repository.VaccineCenterRepository;

@Service
public class VaccineCenterService {
	
	@Autowired
	private VaccineCenterRepository vaccineCenterRepository;
	
	public VaccineCenterRepository getVaccineCenterRepository() {
		return vaccineCenterRepository;
	}
	
	public void setVaccineCenterRepository(VaccineCenterRepository vaccineCenterRepository) {
		this.vaccineCenterRepository = vaccineCenterRepository;
	}
	
	@Transactional(readOnly = true)
	public List<VaccineCenter> getVaccineCenters() {
		return vaccineCenterRepository.findAll();
	}
	
	@Transactional
	public String addCenter(@RequestBody VaccineCenter vaccineCenter) {
		vaccineCenterRepository.save(vaccineCenter);
		
		return "vaccine center saved successfully!";
	}
	
	@Transactional
	public VaccineCenter findVaccineCenterById(@PathVariable(name = "id") long id) {
		return vaccineCenterRepository.findById(id).orElseThrow();
	}

	@Transactional
	public String deleteVaccineCenterById(@PathVariable(name = "id") long id) {
		vaccineCenterRepository.deleteById(id);
		
		return "vaccine center deleted successfully!";
		
	}

}

