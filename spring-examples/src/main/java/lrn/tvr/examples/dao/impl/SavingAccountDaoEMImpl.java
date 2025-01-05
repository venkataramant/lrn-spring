package lrn.tvr.examples.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lrn.tvr.examples.dao.SavingAccountDao;
import lrn.tvr.examples.entity.SavingAccount;

@Repository
public class SavingAccountDaoEMImpl implements SavingAccountDao {

	private EntityManager entityManager;

	@Autowired
	public SavingAccountDaoEMImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public SavingAccount insert(SavingAccount sAccount) {
		entityManager.persist(sAccount);
		return get(sAccount.getAccountNo());
	}

	@Override
	public SavingAccount get(Integer accountId) {
		return entityManager.find(SavingAccount.class, accountId);
	}

}
