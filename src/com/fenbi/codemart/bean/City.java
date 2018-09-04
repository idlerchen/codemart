package com.fenbi.codemart.bean;

/**
 * 城市信息的实体类，封装city表的信息
 *
 */
public class City {

	private String id;
	private String name;
	private String provinceId;

	public City() {
		super();
	}

	public City(String id, String name, String provinceId) {
		super();
		this.id = id;
		this.name = name;
		this.provinceId = provinceId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", provinceId=" + provinceId + "]";
	}

}
