package healthInsuranceInformation.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "program_filters")
public class ProgramFilters {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	  
	@JoinColumn(name = "program_id", referencedColumnName = "program_id")
	private Program program;
	
	@JoinColumn(name = "filter_id", referencedColumnName = "filter_id")
	private Filter filter;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}

	public Filter getFilter() {
		return filter;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;
	}
	
	@Override
    public String toString() {
        return "ProgramFilter: [ id= " + id + ", program= " + program.getProgramName() + ", company= " + program.getCompany().getName() + ", filter= " + filter.getName() + " ]";
    }
}
