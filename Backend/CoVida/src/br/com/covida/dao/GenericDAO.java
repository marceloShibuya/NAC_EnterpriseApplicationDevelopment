package br.com.covida.dao;

import br.com.covida.exception.FailCommitException;
import br.com.covida.exception.KeyNotFoundException;

public interface GenericDAO<T,K> {
	
	void create(T entity);
	
	T read(K key)throws KeyNotFoundException;
	
	void update(T entity);
	
	void delete(K key)throws KeyNotFoundException;
	
	void commit() throws FailCommitException;

}
