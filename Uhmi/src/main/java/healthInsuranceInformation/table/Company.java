package healthInsuranceInformation.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "companies")
public class Company {
	@Id
	@Column(name = "company_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "hotline")
	private String hotline;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHotline(String hotline) {
		this.hotline = hotline;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getHotline() {
		return hotline;
	}
	
	@Override
    public String toString() {
       return "Company[ id= " + id + ", name= " + name + ", hotline= " + hotline + " ]";
    }
}
