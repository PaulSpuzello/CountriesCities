package countries.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import countries.beans.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
	
}