package tvr.lrn.boot.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import tvr.lrn.boot.model.ifc.Account;


@Data
@ToString
public abstract class BasicAccount implements Account{

	private int accountNo;
	private String fullName;
	private double balance;
	
}
