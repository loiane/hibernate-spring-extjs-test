package com.loiane.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.loiane.dao.StateDAO;
import com.loiane.model.State;

/**
 * All the business logic goes here
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
@Service
public class StateService {
	
	private StateDAO stateDAO;

	/**
	 * Return list of all States of Brazil
	 * @return
	 */
	@Transactional(readOnly=true)
	public List<State> getBrazilianStates(){
		
		return stateDAO.getStates();
	}

	@Autowired
	public void setStateDAO(StateDAO stateDAO) {
		this.stateDAO = stateDAO;
	}
	
	
}
