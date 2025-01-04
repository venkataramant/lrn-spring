package tvr.lrn.boot.dao;

import java.util.List;

import tvr.lrn.boot.entity.SavingAccountEntity;


public interface SavingAccountJPADAO {

	public List<SavingAccountEntity> getAccounts();

	public List<SavingAccountEntity> fetchBigAccounts(double balance);
	SavingAccountEntity save(SavingAccountEntity savingAccount);

	SavingAccountEntity findById(int id);
}
