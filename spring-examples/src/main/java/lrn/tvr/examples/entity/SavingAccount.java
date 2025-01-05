package lrn.tvr.examples.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "saving_account")
public class SavingAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_no")
	public int accountNo;

	@Column(name = "balance")
	public double balance;

	@Column(name = "full_name")
	public String fullName;

//	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.MERGE, CascadeType.PERSIST,
//			CascadeType.REFRESH })
//	@JoinColumn(name = "branchName")
//	public BankBranch bankBranch;
//	
//	@OneToOne(cascade = { CascadeType.ALL})
//	@PrimaryKeyJoinColumn(name = "customer")
//	public Customer customer;
}
