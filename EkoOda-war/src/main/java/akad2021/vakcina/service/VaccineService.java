package akad2021.vakcina.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import akad2021.vakcina.model.VaccineFromDatabase;
import akad2021.vakcina.model.VaccineFromService;
import akad2021.vakcina.repository.VaccineRepository;

@Service
public class VaccineService {
	
	@Autowired
	private VaccineRepository vaccineRepository;
	
	
	public VaccineRepository getVaccineRepository() {
		return vaccineRepository;
	}

	public void setVaccineRepository(VaccineRepository vaccineRepository) {
		this.vaccineRepository = vaccineRepository;
	}

	@Transactional
	public List<VaccineFromDatabase> getVaccines() {
		return vaccineRepository.findAll();
	}
	
	@Transactional
	public String createVaccine(@RequestBody VaccineFromService vaccineFromService) {
		 vaccineRepository.save(new VaccineFromDatabase(vaccineFromService.getManufacturer(),
				vaccineFromService.getName(), vaccineFromService.getDescription(), vaccineFromService.getQuantity()));
		 
		 return "vaccine was successfully created!";
	}
	 
	@Transactional
	public VaccineFromDatabase findVaccineById(@PathVariable(name = "id") long id) {
		VaccineFromDatabase productDb = vaccineRepository.findById(id).orElseThrow();
		return productDb;
	}
	
	@Transactional
	public String updateVaccineById(@PathVariable(name = "id") long id, @RequestBody VaccineFromService vaccineDetails) {
		VaccineFromDatabase vaccineDb = vaccineRepository.findById(id).orElseThrow();

		vaccineDb.setManufacturer(vaccineDetails.getManufacturer());
		vaccineDb.setName(vaccineDetails.getName());
		vaccineDb.setDescription(vaccineDetails.getDescription());
		vaccineDb.setQuantity(vaccineDetails.getQuantity());
		vaccineRepository.save(vaccineDb);
		return "vaccine with an id of : " + id + " was successfully updated!";
	}

	@Transactional
	public String deleteVaccineById(@PathVariable(name = "id") long id) {
		VaccineFromDatabase vaccineDb = vaccineRepository.findById(id).orElseThrow();

		vaccineRepository.delete(vaccineDb);
		return "vaccine was successfully deleted!";
			
		}

}
