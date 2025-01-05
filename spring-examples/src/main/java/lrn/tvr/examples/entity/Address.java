package lrn.tvr.examples.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	public int addressId;

	@Column(name = "first_line")
	public String firstLine;
	@Column(name = "second_line")
	public String secondLine;
	@Column(name = "city")
	public String city;
	@Column(name = "state")
	public String state;
	@Column(name = "zipcode")
	public int zipcode;
}
