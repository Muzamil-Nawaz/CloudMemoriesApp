package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CloudMemoriesRepo;
import com.example.demo.model.CloudMemory;


@Service
public class CloudMemoriesService {

	@Autowired
	CloudMemoriesRepo memoriesRepo;
	
	public List<CloudMemory> addMemory(CloudMemory memory) {
		return List.of(memoriesRepo.save(memory));
	}

	public List<CloudMemory> getMemories() {
		
		return memoriesRepo.findAll();
	}

	public String deleteMemory(int id) {
		if(memoriesRepo.existsById(id)) {
			memoriesRepo.deleteById(id);
			return "Successfully deleted memory with id:"+id;
		}
		else {
			return "No Post available with id:"+id;
		}
	}
}
