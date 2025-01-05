package lrn.tvr.examples.dao.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import lrn.tvr.examples.dao.CurrentAccountDao;
import lrn.tvr.examples.entity.CurrentAccount;

@Repository
public interface CurrentAccountDaoImpl extends JpaRepository<CurrentAccount, Integer>, CurrentAccountDao {

	@Override
	@Transactional
	public default CurrentAccount insertAccount(CurrentAccount sAccount) {
		save(sAccount);
		return getAccount(sAccount.getAccountNo());
	}

	@Override
	public default CurrentAccount getAccount(int accountId) {
		return findById(accountId).orElse(null);
	}

}
