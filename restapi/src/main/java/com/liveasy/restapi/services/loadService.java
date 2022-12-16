package com.liveasy.restapi.services;

import java.util.List;

import com.liveasy.restapi.entities.load;

public interface loadService {

	public List<load> getloads();
	
	public load getload(long loadId);
	
	public load addLoad(load load1);
	
	public load updateLoad(load load1);
	
	public void deleteLoad(long parseLong);
}
