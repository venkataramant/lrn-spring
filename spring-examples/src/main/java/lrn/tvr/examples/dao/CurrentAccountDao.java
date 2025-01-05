package lrn.tvr.examples.dao;

import lrn.tvr.examples.entity.CurrentAccount;

public interface CurrentAccountDao {

	public CurrentAccount insertAccount(CurrentAccount sAccount);

	public CurrentAccount getAccount(int accountId);
}
