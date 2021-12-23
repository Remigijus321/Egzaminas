package akad2021.vakcina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import akad2021.vakcina.model.VaccineCenter;
import akad2021.vakcina.model.VaccineFromDatabase;
import akad2021.vakcina.repository.VaccineCenterRepository;
import akad2021.vakcina.repository.VaccineRepository;

@SpringBootApplication
public class App extends SpringBootServletInitializer implements CommandLineRunner {
	
	@Autowired
	private VaccineRepository vaccineRepository;

	@Autowired
	private VaccineCenterRepository vaccineCenterRepository;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		
		
	}
	

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(App.class);
	}

	@Override
	public void run(String... args) throws Exception {
		vaccineRepository.save(new VaccineFromDatabase("Vaccine manufacturer name 1", "Pfizer vaccine 1", "Pfizer description 1", 100));
		vaccineRepository.save(new VaccineFromDatabase("Vaccine manufacturer name 2", "Pfizer vaccine 2", "Pfizer description 2", 200));
		vaccineRepository.save(new VaccineFromDatabase("Vaccine manufacturer name 3", "Pfizer vaccine 3", "Pfizer description 3", 300));

		vaccineCenterRepository.save(new VaccineCenter("Vakcinacijos centras 1", "https://lh3.googleusercontent.com/proxy/ztahZyyu0NV_MbzuBGgiPj-f9I3TNwX_vMywNMMlUop369qWH-R-ncyafnJ6_Oc2f9MWYPKCL110qSVdZtyaRABgcNzXmeAktcGKPwzeLMmUcRrLiTWNv2BD9vKR1-hVamFFjw", "Projekto vakcinacijos centro trumpas apibudinimas 1", "Vakcinacijos centro adresas 1"));
		vaccineCenterRepository.save(new VaccineCenter("Vakcinacijos centras 2", "https://lh3.googleusercontent.com/proxy/ztahZyyu0NV_MbzuBGgiPj-f9I3TNwX_vMywNMMlUop369qWH-R-ncyafnJ6_Oc2f9MWYPKCL110qSVdZtyaRABgcNzXmeAktcGKPwzeLMmUcRrLiTWNv2BD9vKR1-hVamFFjw", "Projekto vakcinacijos centro trumpas apibudinimas 1", "Vakcinacijos centro adresas 2"));
		vaccineCenterRepository.save(new VaccineCenter("Vakcinacijos centras 3", "https://lh3.googleusercontent.com/proxy/ztahZyyu0NV_MbzuBGgiPj-f9I3TNwX_vMywNMMlUop369qWH-R-ncyafnJ6_Oc2f9MWYPKCL110qSVdZtyaRABgcNzXmeAktcGKPwzeLMmUcRrLiTWNv2BD9vKR1-hVamFFjw", "Projekto vakcinacijos centro trumpas apibudinimas 1", "Vakcinacijos centro adresas 3"));

	}
}
