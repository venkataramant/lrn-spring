package lrn.tvr.examples.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "business_customer")
public class BusinessCustomer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "business_customer_id")
	public int businessCustomerId;

	@Column(name = "business_name")
	public String businessName;
	@Column(name = "category")
	public String category;
	@Column(name = "business_size")
	public String businessSize;
	@Column(name = "state")
	public String state;
	@OneToOne()
	@PrimaryKeyJoinColumn(name = "address_id")
	public Address address;
}
