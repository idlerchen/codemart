package com.fenbi.codemart.bean;

import java.util.Date;

/**
 * 项目信息的实体类，封装item表的信息
 *
 */
public class Item {

	private int id;
	private int userid;
	private int itemtype;
	private int roleId;
	private String name;
	private int industryId;
	private int money;
	private String period;
	private String linkMan;
	private String linkEmail;
	private String linkTelephone;
	private String refer;
	private String detail;
	private int state;
	private int viewNum;
	private int applicantNum;
	private Date createTime;
	private String difftime;

	private String stateName;
	private String itemtypeName;
	private String roleName;
	private String industryName;

	public Item() {
		super();
	}

	public Item(int id, int userid, int itemtype, int roleId, String name, int industryId, int money, String period,
			String linkMan, String linkEmail, String linkTelephone, String refer, String detail, int state, int viewNum,
			int applicantNum, Date createTime, String stateName, String itemtypeName, String roleName,
			String industryName) {
		super();
		this.id = id;
		this.userid = userid;
		this.itemtype = itemtype;
		this.roleId = roleId;
		this.name = name;
		this.industryId = industryId;
		this.money = money;
		this.period = period;
		this.linkMan = linkMan;
		this.linkEmail = linkEmail;
		this.linkTelephone = linkTelephone;
		this.refer = refer;
		this.detail = detail;
		this.state = state;
		this.viewNum = viewNum;
		this.applicantNum = applicantNum;
		this.createTime = createTime;
		this.stateName = stateName;
		this.itemtypeName = itemtypeName;
		this.roleName = roleName;
		this.industryName = industryName;
	}

	
	public String getDifftime() {
		return difftime;
	}

	public void setDifftime(String difftime) {
		this.difftime = difftime;
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

	public int getItemtype() {
		return itemtype;
	}

	public void setItemtype(int itemtype) {
		this.itemtype = itemtype;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndustryId() {
		return industryId;
	}

	public void setIndustryId(int industryId) {
		this.industryId = industryId;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getLinkMan() {
		return linkMan;
	}

	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}

	public String getLinkEmail() {
		return linkEmail;
	}

	public void setLinkEmail(String linkEmail) {
		this.linkEmail = linkEmail;
	}

	public String getLinkTelephone() {
		return linkTelephone;
	}

	public void setLinkTelephone(String linkTelephone) {
		this.linkTelephone = linkTelephone;
	}

	public String getRefer() {
		return refer;
	}

	public void setRefer(String refer) {
		this.refer = refer;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getViewNum() {
		return viewNum;
	}

	public void setViewNum(int viewNum) {
		this.viewNum = viewNum;
	}

	public int getApplicantNum() {
		return applicantNum;
	}

	public void setApplicantNum(int applicantNum) {
		this.applicantNum = applicantNum;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getItemtypeName() {
		return itemtypeName;
	}

	public void setItemtypeName(String itemtypeName) {
		this.itemtypeName = itemtypeName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getIndustryName() {
		return industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", userid=" + userid + ", itemtype=" + itemtype + ", roleId=" + roleId + ", name="
				+ name + ", industryId=" + industryId + ", money=" + money + ", period=" + period + ", linkMan="
				+ linkMan + ", linkEmail=" + linkEmail + ", linkTelephone=" + linkTelephone + ", refer=" + refer
				+ ", detail=" + detail + ", state=" + state + ", viewNum=" + viewNum + ", applicantNum=" + applicantNum
				+ ", createTime=" + createTime + ", stateName=" + stateName + ", itemtypeName=" + itemtypeName
				+ ", roleName=" + roleName + ", industryName=" + industryName + "]";
	}

	
}
