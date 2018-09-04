package com.fenbi.codemart.bean;

import java.util.Date;
import java.util.List;

/**
 * 开发者信息的实体类，封装developer表的信息
 *
 */
public class Developer {

	private int id;
	private int userid;
	private String role;
	private String workStatus;
	private Date createTime;

	private List<DeveloperCase> developerCaseList;

	public Developer() {
		super();
	}

	public Developer(int id, int userid, String role, String workStatus, Date createTime) {
		super();
		this.id = id;
		this.userid = userid;
		this.role = role;
		this.workStatus = workStatus;
		this.createTime = createTime;
	}
	
	public Developer(int userid, String role, String workStatus) {
		super();
		this.userid = userid;
		this.role = role;
		this.workStatus = workStatus;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public List<DeveloperCase> getDeveloperCaseList() {
		return developerCaseList;
	}

	public void setDeveloperCaseList(List<DeveloperCase> developerCaseList) {
		this.developerCaseList = developerCaseList;
	}

	@Override
	public String toString() {
		return "Developer [id=" + id + ", userid=" + userid + ", role=" + role + ", workStatus=" + workStatus
				+ ", createTime=" + createTime + ", developerCaseList=" + developerCaseList + "]";
	}

}
