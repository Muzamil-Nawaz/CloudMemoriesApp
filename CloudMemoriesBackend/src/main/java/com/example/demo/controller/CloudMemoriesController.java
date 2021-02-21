package com.example.demo.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CloudMemory;
import com.example.demo.service.CloudMemoriesService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CloudMemoriesController {
	
	
	@Autowired
	CloudMemoriesService memoriesService;
	
	
	@PostMapping
	public List addMemory(@RequestBody CloudMemory memory) {
		
		Random r = new Random();
		memory.setId(r.nextInt(1000000));
		System.out.println(memory);
		return memoriesService.addMemory(memory);
	
	}
	
	@GetMapping
	public List<CloudMemory> getMemories() {
	
		return memoriesService.getMemories();
	}
	
	@DeleteMapping
	public String deleteMemory(@RequestParam("id") int id){
		
		return memoriesService.deleteMemory(id);
	}
	
	
	
}
