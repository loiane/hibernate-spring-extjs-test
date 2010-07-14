package com.loiane.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
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
public class StateDAO extends HibernateDaoSupport implements IStateDAO{

	@Override
	public State getState(Long id) {
		return getHibernateTemplate().get(State.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<State> getStates() {
		return getHibernateTemplate().find("from State");
	}

	@Override
	public void saveState(State record) {
		getHibernateTemplate().saveOrUpdate(record);
	}

	@Override
	public void removeState(Long id) {
		Object record = getHibernateTemplate().load(State.class, id);
		getHibernateTemplate().delete(record);
	}

}
