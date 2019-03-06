package com.objis.demospring.dao;

import java.util.List;

import com.objis.demospring.domaine.Formation;

public abstract class FormationDao implements IFormationDao {

	/* (non-Javadoc)
	 * @see com.objis.spring.demodao.IformationDAO#create(com.objis.spring.demodomaine.Formation)
	 */
	/* (non-Javadoc)
	 * @see com.objis.demospring.dao.IFormationDao#create(com.objis.demospring.domaine.Formation)
	 */
	public void create(Formation formation) {
		System.out.println("créer formation" + formation.toString());
	}

	/* (non-Javadoc)
	 * @see com.objis.demospring.dao.IFormationDao#findAll()
	 */
	public List<Formation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
