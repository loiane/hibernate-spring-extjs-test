package com.loiane.dao;

import java.util.List;

import com.loiane.model.State;

/**
 * DAO Interface
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
public interface IStateDAO {

	State getState(Long id);

    List<State> getStates();

    void saveState(State record);

    void removeState(Long id);
}
