package com.zhangdong.common.utils;

public class person {

	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public person(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public person() {
		super();
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + "]";
	}
	
	
}
