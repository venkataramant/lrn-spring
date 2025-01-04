package tvr.lrn.boot.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import tvr.lrn.boot.dao.SavingAccountJPADAO;
import tvr.lrn.boot.entity.SavingAccountEntity;

@Repository
public class SavingAccountJPADAOImpl implements SavingAccountJPADAO {
	@Autowired
	private EntityManager entityManager;

//	@Query("Select s from SavingAccount s")
    @Override
    @Transactional
	public List<SavingAccountEntity> getAccounts() {
		return null;
	}

//	@Query("select s from SavingAccount s where s.balance>:balance")
    @Override
    @Transactional
	public List<SavingAccountEntity> fetchBigAccounts(double balance) {
		return null;
	}

    @Override
    @Transactional
	public SavingAccountEntity save(SavingAccountEntity savingAccount) {
		entityManager.persist(savingAccount);
		return savingAccount;
	}
    @Override
    @Transactional
	public SavingAccountEntity findById(int id) {
		return entityManager.find(SavingAccountEntity.class, id);

	}
}
