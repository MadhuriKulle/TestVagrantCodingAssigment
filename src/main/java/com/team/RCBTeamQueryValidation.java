package com.team;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

public class RCBTeamQueryValidation extends ConvertJSONToPOJOClass {

	//1. Validate that the RCB Team has only 4 foreign players
	
	public int verifyNumberOfForeignPlayer() throws StreamReadException, DatabindException, IOException {
		
		List<Players> players = convertJSONFileIntoPOJO().getPlayer();
		int foreignPlayer=0;
		
		for(int i=0; i<players.size(); i++)
		{
			if(!players.get(i).getCountry().equalsIgnoreCase("India"))
			{
				foreignPlayer++;
			}
		}
		return foreignPlayer;
	}
}
