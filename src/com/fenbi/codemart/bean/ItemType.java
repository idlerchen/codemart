package com.fenbi.codemart.bean;

/**
 * 项目类型信息的实体类，封装item_type表的信息
 *
 */
public class ItemType {

	private int id;
	private String name;

	public ItemType() {
		super();
	}

	public ItemType(int id, String name) {
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
		return "ItemType [id=" + id + ", name=" + name + "]";
	}

}
