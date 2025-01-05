package lrn.tvr.examples.dao;

import lrn.tvr.examples.entity.SavingAccount;

public interface SavingAccountDao {

	public SavingAccount insertAccount(SavingAccount sAccount);

	public SavingAccount getAccount(int accountId);
}
