package com.objis.demospring.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.objis.demospring.dao.IFormationDao;
import com.objis.demospring.domaine.Formation;

public interface IformationService extends JpaRepository<Formation, Integer>{

	void creerformation(Formation formation);

	void initmethod();

	void destroymethod();

}