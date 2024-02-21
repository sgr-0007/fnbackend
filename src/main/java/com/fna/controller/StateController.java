package com.fna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.State;
import com.fna.model.StateDetails;
import com.fna.service.StateService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class StateController {

	@Autowired
	private StateService stateService;
	@Transactional(readOnly = true)
	@GetMapping("/state")
	public ResponseEntity<List<StateDetails>> getAllStates() {
		return stateService.getStates();
	}

@GetMapping("/States")
    public ResponseEntity<List<State>> findStates() {     
	return stateService.getstates();
    }
}
