package com.team.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.team.RCBTeamQueryValidation;

public class RCBTeamQueryValidationTest {

	public static RCBTeamQueryValidation rcbTeam = new RCBTeamQueryValidation();
	
	//Test001 Validate that the RCB Team has only 4 foreign players
	
	@Test
	public void test001_verifyNumberOfForeignPlayertest() throws StreamReadException, DatabindException, IOException {
		
		  int foreignPlayercount = rcbTeam.verifyNumberOfForeignPlayer();
		  System.out.println("Number of foreign Player in RCBTeam: "+foreignPlayercount);
		  
		  Assert.assertEquals(foreignPlayercount, 4);
	}
	
	////Test002 Validate that Atleast one wicketKeeper available in RCBTeam
	
	@Test
	public void test002_verifyWickertKeeperAvailable() throws StreamReadException, DatabindException, IOException {
		
		int wicketKeeper = rcbTeam.getNumberOfWicketKeeper();
		System.out.println("Number of WicketKeeper available in RCBteam: "+ wicketKeeper);
		Assert.assertEquals(wicketKeeper>=1, true);
	}
	
}
