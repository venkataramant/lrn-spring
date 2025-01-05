package lrn.tvr.examples.dao.impl;

import org.springframework.stereotype.Repository;

import lrn.tvr.examples.dao.AddressDao;
import lrn.tvr.examples.entity.Address;

@Repository
public interface AddressDaoImpl extends DaoImpl<Address, Integer>, AddressDao {

	

}
