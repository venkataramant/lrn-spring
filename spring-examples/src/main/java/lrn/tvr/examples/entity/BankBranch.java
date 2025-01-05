package lrn.tvr.examples.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "bank_branch")
public class BankBranch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "branch_id")
	private int branchId;

	@Column(name = "branch_name")
	private String branchName;

	@PrimaryKeyJoinColumn(name = "branch_id")
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
//	@OneToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.MERGE, CascadeType.PERSIST,
//			CascadeType.REFRESH },mappedBy = "bankBranch")
//	private List<SavingAccount> savingAccounts;
}
