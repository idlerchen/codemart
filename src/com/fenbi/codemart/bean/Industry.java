package com.fenbi.codemart.bean;

/**
 * 行业信息的实体类，封装industry表的信息
 *
 */
public class Industry {

	private int id;
	private String name;

	public Industry() {
		super();
	}

	public Industry(int id, String name) {
		super();
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
		return "Industry [id=" + id + ", name=" + name + "]";
	}

}
