package tvr.lrn.boot.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import tvr.lrn.boot.model.ifc.Account;


@Getter
@Setter
@ToString
public abstract class BasicAccount implements Account{

	private int accountNo;
	private String fullName;
	private double balance;
	
}
