package lrn.tvr.examples.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lrn.tvr.examples.dao.SavingAccountDao;
import lrn.tvr.examples.entity.SavingAccount;

@Repository
public class SavingAccountDaoImpl implements SavingAccountDao {

	private EntityManager entityManager;

	@Autowired
	public SavingAccountDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public SavingAccount insertAccount(SavingAccount sAccount) {
		// TODO Auto-generated method stub
		entityManager.persist(sAccount);
		return getAccount(sAccount.getAccountNo());
	}

	@Override
	public SavingAccount getAccount(int accountId) {
		return entityManager.find(SavingAccount.class, accountId);
	}

}
