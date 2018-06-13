package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
@CrossOrigin
@RestController

public class api {

	@RequestMapping(value="/insert" ,method=RequestMethod.POST , produces= MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void insert (entity en) {
		
		crud c = new crud();
		c.insert(en);
		
	}
	

	@RequestMapping(value="/delete" ,method=RequestMethod.DELETE,produces= MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void delete (int id) {
		
		crud c = new crud();
		c.delete(id);
		
	}

	@RequestMapping(value="/update" ,method=RequestMethod.PUT,produces= MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void update (entity en) {
		
		crud c = new crud();
		c.insert(en);
		
	}
	
}
