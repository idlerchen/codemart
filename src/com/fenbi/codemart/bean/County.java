package com.fenbi.codemart.bean;

/**
 * 区县信息的实体类，封装county表的信息
 *
 */
public class County {

	private String id;
	private String name;
	private String cityId;

	public County() {
		super();
	}

	public County(String id, String name, String cityId) {
		super();
		this.id = id;
		this.name = name;
		this.cityId = cityId;
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

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	@Override
	public String toString() {
		return "County [id=" + id + ", name=" + name + ", cityId=" + cityId + "]";
	}

}
