package lrn.tvr.examples.dao.impl;

import org.springframework.stereotype.Repository;

import lrn.tvr.examples.dao.CurrentAccountDao;
import lrn.tvr.examples.entity.CurrentAccount;

@Repository
public interface CustomerDaoImpl extends DaoImpl<CurrentAccount, Integer>, CurrentAccountDao {

	

}
