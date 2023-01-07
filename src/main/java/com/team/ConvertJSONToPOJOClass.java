package com.team;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJSONToPOJOClass {

	public RCBTeam convertJSONFileIntoPOJO() throws StreamReadException, DatabindException, IOException {
		//Login to convert JSON file into POJO class
		ObjectMapper objectMapper = new ObjectMapper();
		RCBTeam rcbTeamDetails = objectMapper.readValue(
				new File(System.getProperty("user.dir") + "/jsonfile/TeamRCB.json"), RCBTeam.class);
		return rcbTeamDetails;
		
	}
}
