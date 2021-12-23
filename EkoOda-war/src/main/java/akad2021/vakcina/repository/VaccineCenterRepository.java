package akad2021.vakcina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import akad2021.vakcina.model.VaccineCenter;

@Repository
public interface VaccineCenterRepository extends JpaRepository<VaccineCenter, Long> {

}
