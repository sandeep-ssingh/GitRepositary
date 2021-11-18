/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jagranenglish.core.dao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class AbstractDao<T extends Serializable> {

	private Class<T> pojoType;
	private Session session;

	protected Session getSession() {
		return this.session;
	}

	@Autowired
	public void setSession(Session session) {
		this.session = session;
	}

	public void setPojoType(Class<T> pojoType) {
		this.pojoType = pojoType;
	}

	public Class<T> getPojoType() {
		return this.pojoType;
	}

	/*public T findById(BigDecimal id) {
		return (T) session.get(pojoType, id);
	}*/
	public T findById(Integer id) {
		return (T) session.get(pojoType, id);
	}
	

	public T findById(Class other, BigDecimal id) {
		return (T) session.get(other, id);
	}

	public List<T> findAll() {
		return (List<T>) session.createCriteria(pojoType).list();
	}

	public List findAll(Class metaType) {
		return session.createCriteria(metaType).list();
	}

	public void add(T pojo) {
		session.save(pojo);
	}

	public void update(T pojo) {
		//session.saveOrUpdate(pojo);
		// this.session.clear();
		 this.session.saveOrUpdate(pojo);	
	}

	public void marge(T pojo) {
		 this.session.merge(pojo);	
	}
	
	public void delete(T pojo) {
		session.delete(pojo);

	}

	public void persist(T pojo) {
		session.persist(pojo);

	}

	public void deleteById(Integer id) {
		T pojo = findById(id);
		delete(pojo);
	}

	public long count() {
		Criteria countCriteria = session.createCriteria(pojoType);
		countCriteria.setProjection(Projections.rowCount());
		return ((Long) countCriteria.uniqueResult()).longValue();
	}
}
