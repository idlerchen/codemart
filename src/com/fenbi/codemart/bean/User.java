package com.fenbi.codemart.bean;

import java.util.Date;

/**
 * 用户信息的实体类，封装user表的信息
 *
 */
public class User {

	private int id;
	private int userType;
	private String username;
	private String telephone;
	private String password;
	private String email;
	private String realname;
	private String qqNum;
	private int provinceId;
	private int cityId;
	private int countyId;
	private String photoUrl;
	private Date createTime;

	public User() {
		super();
	}

	public User(int id, int userType, String username, String telephone, String password, String email, String realname,
			String qqNum, int provinceId, int cityId, int countyId, String photoUrl, Date createTime) {
		super();
		this.id = id;
		this.userType = userType;
		this.username = username;
		this.telephone = telephone;
		this.password = password;
		this.email = email;
		this.realname = realname;
		this.qqNum = qqNum;
		this.provinceId = provinceId;
		this.cityId = cityId;
		this.countyId = countyId;
		this.photoUrl = photoUrl;
		this.createTime = createTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getQqNum() {
		return qqNum;
	}

	public void setQqNum(String qqNum) {
		this.qqNum = qqNum;
	}

	public int getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getCountyId() {
		return countyId;
	}

	public void setCountyId(int countyId) {
		this.countyId = countyId;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userType=" + userType + ", username=" + username + ", telephone=" + telephone
				+ ", password=" + password + ", email=" + email + ", realname=" + realname + ", qqNum=" + qqNum
				+ ", provinceId=" + provinceId + ", cityId=" + cityId + ", countyId=" + countyId + ", photoUrl="
				+ photoUrl + ", createTime=" + createTime + "]";
	}

}
