package healthInsuranceInformation.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "types_of_clients")
public class TypeOfClients {
	@javax.persistence.Id
	@Column(name = "type_of_clients_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	@Column(name = "name")
	private String name;
	
	public void setId(int Id) {
		this.Id = Id;
	}
	
	public void setName(String name) {
		this.name = name;
	} 
	
	public int getId() {
		return Id;
	}
	
	public String getName() {
		return name;
	}
}
