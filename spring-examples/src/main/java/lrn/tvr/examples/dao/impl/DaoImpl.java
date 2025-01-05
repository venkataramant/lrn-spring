package lrn.tvr.examples.dao.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import jakarta.transaction.Transactional;
import lrn.tvr.examples.dao.GenericDao;

@NoRepositoryBean
public interface DaoImpl<T,ID> extends JpaRepository<T, ID> ,GenericDao<T, ID> {

	
	@Override
	@Transactional
	public default T insert(T t) {
		return save(t);
		
	}

	@Override
	public default T get(ID id) {
		return findById(id).orElse(null);
	}

}
