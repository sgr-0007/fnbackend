package com.fna.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.State;
import com.fna.model.StateDetails;
import com.fna.repository.StateRepository;
import com.fna.repository.staterepo;

@Service
public class StateService {
	@Autowired
	private StateRepository stateRepository;

	@Autowired
	private staterepo staterepo;


	public ResponseEntity<List<StateDetails>> getStates(){
		
		List<StateDetails> stateDetails = stateRepository.getStateList();
        
        return new ResponseEntity<>(stateDetails,HttpStatus.OK);
	   
	   
}
	public ResponseEntity<List<State>> getstates() {
		try {
			List<State> state = new ArrayList<State>();
			staterepo.findAll().forEach(state::add);
			if (state.isEmpty()) {
				System.out.println("empty");
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(state, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
