package com.liveasy.restapi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liveasy.restapi.dao.loadDao;
import com.liveasy.restapi.entities.load;

@Service
public class loadServiceImpl implements loadService {

	@Autowired
	private loadDao loaddao;
	
	public loadServiceImpl()
	{
	}
	
	@Override
	public List<load> getloads() { 
	
		return loaddao.findAll();
	}

	
	@Override
	public load getload(long loadId) {
	
		return loaddao.findById(loadId).get();
	}

	@Override
	public load addLoad(load load1) {
	//	list.add(load1);
		
		loaddao.save(load1);
		return load1;
	}

	@Override
	public load updateLoad(load load1) {

		loaddao.save(load1);
		return load1;
	}

	@Override
	public void deleteLoad(long parseLong) {
	
		load entity =loaddao.findById(parseLong).get();
		loaddao.delete(entity);
	}
	

}
