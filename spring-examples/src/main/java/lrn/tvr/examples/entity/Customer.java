package lrn.tvr.examples.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	public int customerId;

	@Column(name = "first_name")
	public String firstName;
	@Column(name = "last_name")
	public String lastName;
	@Column(name = "middle_name")
	public String middleName;
	@Column(name = "occupation")
	public String occupation;
	@Column(name = "empoyment_type")
	public String employmentType;
	@OneToOne()
	@PrimaryKeyJoinColumn(name = "address_id")
	public Address address;
}
