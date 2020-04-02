package countries.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;


@Entity
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String continent;
	private Boolean UNMember;
	@Autowired
	private Cities cities;
	
	
	public Country() {
		super();
	}
	
	public Country(String name) {
		this.name = name;
	}
	
	public Country(String name, String continent, Boolean UNMember) {
		this.name = name;
		this.continent = continent;
		this.UNMember = UNMember;
	}
	
	public Country(long id, String name, String continent, Boolean UNMember) {
		this.id = id;
		this.name = name;
		this.continent = continent;
		this.UNMember = UNMember;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	public Boolean getUNMember() {
		return UNMember;
	}

	public void setUNMember(Boolean UNMember) {
		this.UNMember = UNMember;
	}
	
	public Cities getCities() {
		return cities;
	}

	public void setCities(Cities cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", continent=" + continent + ", UN Member=" + UNMember + "]";
	}
}
