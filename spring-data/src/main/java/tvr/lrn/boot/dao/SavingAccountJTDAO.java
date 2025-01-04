package tvr.lrn.boot.dao;

import java.util.List;

import tvr.lrn.boot.model.SavingAccount;

public interface SavingAccountJTDAO {

	public List<SavingAccount> getAccounts();
	public int insert(SavingAccount sa);
	public List<SavingAccount> fetchBigAccounts(double balance);
	
}
