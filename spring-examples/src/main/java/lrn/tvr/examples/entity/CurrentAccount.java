package lrn.tvr.examples.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "current_account")
public class CurrentAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_no")
	private int accountNo;
	@Column(name = "business_name")
	private String businessName;
	@Column(name = "balance")
	private double balance;
	@Column(name = "overdraw_amount")
	private double overdrawAmount = 0.0;
}
