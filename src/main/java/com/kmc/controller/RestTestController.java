package com.kmc.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kmc.domain.JsonTestVO;

@RestController
@RequestMapping("/test")
public class RestTestController {
	
	@RequestMapping(value="/string")
	public String stringGET() throws Exception
	{
		return "TestString";
	}
	
	@RequestMapping(value="/json")
	public JsonTestVO jsonGET() throws Exception
	{
		JsonTestVO json = new JsonTestVO();
		
		json.setFirstName("Kim");
		json.setLastName("minchan");
		json.setMno(2017);
		return json;
	}
	@RequestMapping(value="/jsons")
	public List<JsonTestVO> jsonsGET() throws Exception
	{
		List<JsonTestVO> jsons = new ArrayList<JsonTestVO>();
		
		for(int i=0; i<10; i++)
		{
			JsonTestVO json = new JsonTestVO();
			json.setFirstName("Kim");
			json.setLastName("minchan");
			json.setMno(i);
			jsons.add(json);
		}
		
		return jsons; 
	}
	
}
