package com.objis.demospring.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.objis.demospring.dao.IFormationDao;
import com.objis.demospring.domaine.Formation;

public abstract class FormationService implements IformationService {
	@Autowired
	private IFormationDao dao;

	/* (non-Javadoc)
	 * @see com.objis.demospring.service.IformationService#getDao()
	 */
	public IFormationDao getDao() {
		return dao;
	}

	/* (non-Javadoc)
	 * @see com.objis.demospring.service.IformationService#setDao(com.objis.demospring.dao.IFormationDao)
	 */
	public void setDao(IFormationDao dao) {
		this.dao = dao;
	}

	/* (non-Javadoc)
	 * @see com.objis.demospring.service.IformationService#creerformation(com.objis.demospring.domaine.Formation)
	 */
	public void creerformation(Formation formation) {
		dao.create(formation);
	}
	
	/* (non-Javadoc)
	 * @see com.objis.demospring.service.IformationService#initmethod()
	 */
	public void initmethod() {
		System.out.println("je suis init");
	}
	
	/* (non-Javadoc)
	 * @see com.objis.demospring.service.IformationService#destroymethod()
	 */
	public void destroymethod() {
		System.out.println("je suis destroy");
	}
}
