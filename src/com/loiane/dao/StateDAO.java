package com.loiane.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.loiane.model.State;

/**
 * DAO - connects to database using Spring and Hibernate
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
@Repository
public class StateDAO implements IStateDAO{
	
	private HibernateTemplate hibernateTemplate;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public State getState(Long id) {
		return hibernateTemplate.get(State.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<State> getStates() {
		return hibernateTemplate.find("from State");
	}

	@Override
	public void saveState(State record) {
		hibernateTemplate.saveOrUpdate(record);
	}

	@Override
	public void removeState(Long id) {
		Object record = hibernateTemplate.load(State.class, id);
		hibernateTemplate.delete(record);
	}

}
