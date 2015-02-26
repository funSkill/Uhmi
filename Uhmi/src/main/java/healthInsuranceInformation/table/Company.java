package healthInsuranceInformation.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "companies")
public class Company {
	@javax.persistence.Id
	@Column(name = "company_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "hotline")
	private String hotline;
	
	public void setId(int Id) {
		this.Id = Id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHotline(String hotline) {
		this.hotline = hotline;
	}
	
	public int getId() {
		return Id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getHotline() {
		return hotline;
	}
		
}
