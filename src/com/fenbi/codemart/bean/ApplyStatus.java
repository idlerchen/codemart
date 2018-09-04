package com.fenbi.codemart.bean;

/**
 * 报名状态的实体类
 *
 */
public class ApplyStatus {
	private int id;
	private String name;
	public ApplyStatus() {
		super();
	}
	
	public ApplyStatus(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ApplyStatus [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
