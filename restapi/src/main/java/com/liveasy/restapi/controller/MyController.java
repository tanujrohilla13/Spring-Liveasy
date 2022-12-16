package com.liveasy.restapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.liveasy.restapi.entities.load;
import com.liveasy.restapi.services.loadService;

@RestController  //representational state transfer
public class MyController {
	

	@Autowired
	private loadService loadservice;

	@GetMapping("/load")
	public List<load> getloads()
	{
		return this.loadservice.getloads();
	}
	
	@GetMapping("/load/{loadId}")
	public load getload(@PathVariable String loadId)
	{
		return this.loadservice.getload(Long.parseLong(loadId));
	}
	
	@PostMapping("/load")
	public load addLoad(@RequestBody load load1)
	{
		return this.loadservice.addLoad(load1);
	}
	
	@PutMapping("/load")
	public load updateLoad(@RequestBody load load1)
	{
		return this.loadservice.updateLoad(load1);
	}
	
	
	@DeleteMapping("/load/{loadId}")
	public ResponseEntity <HttpStatus> deleteLoad(@PathVariable String loadId)
	{
		try {
			this.loadservice.deleteLoad(Long.parseLong(loadId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
