package tn.enicarthage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MedicationRepository extends JpaRepository<Medication, Long>{

}
