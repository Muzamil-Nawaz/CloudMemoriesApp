package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CloudMemory {

	@Id
	private int id;
	private String title;
	private String memoryDesc;
	private String tags;
	private String image;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return memoryDesc;
	}
	public void setDesc(String desc) {
		this.memoryDesc = desc;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Memory [id=" + id + ", title=" + title + ", desc=" + memoryDesc + ", tags=" + tags + ", image=" + image + "]";
	}
	
	
	
	
	
	
}
