package com.objis.demospring.demospringdata;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.objis.demospring.domaine.Formation;
import com.objis.demospring.service.IformationService;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	private static final Logger logger = Logger.getLogger(AppTest.class);
	 	 
	protected void setUp() throws Exception {
        super.setUp ();
        try{
	        
	        Formation formation = new Formation ("GTM" );
	        
	        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
	        
	        IformationService formationService = (IformationService) appContext.getBean("formationservice");
	        formationService.creerformation(formation);
	        
        } catch (Exception e) {
			 e.printStackTrace();
	     }
    }
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
