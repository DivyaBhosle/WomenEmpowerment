package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.NGO;

@Repository("NGORepository")
public class NGORepositoryImpl implements NGORepository
{
	@PersistenceContext
	EntityManager em;

	@Transactional
    public NGO addNGO(NGO n) 
	{
		
		em.persist(n);
		return n;
	}

}
