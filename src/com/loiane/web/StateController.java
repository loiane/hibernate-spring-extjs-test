package com.loiane.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.loiane.model.State;
import com.loiane.service.StateService;

/**
 * Controller - Spring
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
@Controller
public class StateController {

	private StateService stateService;

	@RequestMapping(value="getStates.json", method = RequestMethod.GET)
	public @ResponseBody Map<String,? extends Object> loadStates() {

		HashMap<String, List<State>> modelMap = new HashMap<String,List<State>>();
		modelMap.put("states", stateService.getBrazilianStates());

		return modelMap;
	}

	@Autowired
	public void setStateService(StateService stateService) {
		this.stateService = stateService;
	}

}
