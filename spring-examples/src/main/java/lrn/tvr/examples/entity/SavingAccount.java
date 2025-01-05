package lrn.tvr.examples.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "saving_account")
public class SavingAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_no")
	public int accountNo;

	@Column(name = "balance")
	public double balance;

	@Column(name = "full_name")
	public String fullName;
}
