package fa.training.services;

public interface BaseDAO<T, K> {

	public void save(T obj);

	public void update(K str);
	
	public void delete(K str);
	
	public void findAll();
	
	public void search(K str);
}
