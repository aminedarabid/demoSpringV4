package com.objis.demospring.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.objis.demospring.domaine.Formation;

public interface IFormationDao extends JpaRepository<Formation, Integer>{

	/* (non-Javadoc)
	 * @see com.objis.spring.demodao.IformationDAO#create(com.objis.spring.demodomaine.Formation)
	 */
	void create(Formation formation);

	List<Formation> findAll();

}