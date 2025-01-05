package lrn.tvr.examples.dao;

// Generic Interface
public interface GenericDao<T, ID> {
	public T insert(T sAccount);

	public T get(ID accountId);
}
