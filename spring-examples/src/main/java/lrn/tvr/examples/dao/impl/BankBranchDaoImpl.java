package lrn.tvr.examples.dao.impl;

import org.springframework.stereotype.Repository;

import lrn.tvr.examples.dao.BankBranchDao;
import lrn.tvr.examples.entity.BankBranch;

@Repository
public interface BankBranchDaoImpl extends DaoImpl<BankBranch, Integer>, BankBranchDao {



}
