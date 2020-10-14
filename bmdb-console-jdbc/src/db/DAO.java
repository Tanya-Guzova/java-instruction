package db;

import java.util.List;
//this interface is used to work with any type of objects (T-generic)
public interface DAO<T> {
	T get(int id);
	List<T> getAll();
	List<T> findByLastName(String string);
	boolean add(T t);
	boolean update(T t);
	boolean delete(T t);
}