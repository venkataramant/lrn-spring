package tvr.lrn.boot.model.entity.bank.hr;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int branchId;
	@Column(name = "name",unique = true)
	private String name;
	@OneToOne()
	private Address address ;
}
