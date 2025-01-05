package lrn.tvr.examples.dao.impl;

import org.springframework.stereotype.Repository;

import lrn.tvr.examples.dao.BusinessCustomerDao;
import lrn.tvr.examples.entity.BusinessCustomer;

@Repository
public interface BusinessCustomerDaoImpl extends DaoImpl<BusinessCustomer, Integer>, BusinessCustomerDao {

	

}
