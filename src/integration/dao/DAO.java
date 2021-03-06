package integration.dao;

public interface DAO<Data> {
	public void create(Data entity);
	public void update(Data entity);
	public Data read(String pk);
	public void delete(String pk);
}
