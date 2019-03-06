package com.objis.demospring.demospringdata;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.objis.demospring.domaine.Formation;
import com.objis.demospring.service.IformationService;



/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
		 try{
			/*
			 * Formation formation = new Formation("GTM");
			 * 
			 * // TODO Auto-generated method stub // 1. Chargement du conteneur en 4.0.0
			 * Spring ApplicationContext appContext = new
			 * ClassPathXmlApplicationContext("spring-data.xml");
			 * 
			 * // 2. Recuperation d'un bean du conteneur IformationService formationService
			 * = (IformationService) appContext.getBean("formationService");
			 * 
			 * // 3. Manipulation du bean avec injection de dependances
			 * //formationService.creerformation(formation);
			 * logger.info("Chef Developpeur: ");
			 */
			
		 } catch (Exception e) {
			 e.printStackTrace();
	     }
    }
}
