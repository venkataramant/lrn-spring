package lrn.tvr.examples.dao.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import lrn.tvr.examples.dao.SavingAccountDao;
import lrn.tvr.examples.entity.SavingAccount;

@Repository
@Primary
public interface SavingAccountDaoImpl   extends DaoImpl<SavingAccount, Integer>,   SavingAccountDao {

	

}
