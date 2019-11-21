package com.lti.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.NGO;
import com.lti.repository.NGORepository;

@Service("NGOService")
public class NGOServiceImpl implements NGOService {

	@Autowired
	NGORepository repository;

	@Transactional
	public NGO addNGO(NGO n) 
	{
		return repository.addNGO(n);
	}

}
