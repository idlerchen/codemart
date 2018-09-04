package com.fenbi.codemart.bean;

import java.util.Date;

/**
 * 申请信息的实体类，封装apply表的信息
 *
 */
public class Apply {

	private int id;
	private int itemId;
	private int developerId;
	private int state;
	private String note;
	private Date createTime;
	//我发布的项目中需要字段
	private String difftime;
	private String workStatus;
	private String realName;
	private String telephone;
	private String photoUrl;
	private String provinceName;
	private String cityName;
	private String countyName;
	//我参与的项目中需要字段
	private String itemName;
	private String itemRole;
	private int itemMoney;
	private int period;
	private int itemView;
	private int itemApply;
	private String stateName;
	private String itemtype;
	public Apply() {
		super();
	}

	public Apply(int id, int itemId, int developerId, int state, String note, Date createTime) {
		super();
		this.id = id;
		this.itemId = itemId;
		this.developerId = developerId;
		this.state = state;
		this.note = note;
		this.createTime = createTime;
	}

	
	public Apply(int itemId, int developerId, int state) {
		this.itemId = itemId;
		this.developerId = developerId;
		this.state = state;
	}
	
	

	public Apply(int id, int itemId, int developerId, int state, String note, Date createTime, String workStatus,
			String realName, String telephone, String photoUrl, String provinceName, String cityName,
			String countyName) {
		super();
		this.id = id;
		this.itemId = itemId;
		this.developerId = developerId;
		this.state = state;
		this.note = note;
		this.createTime = createTime;
		this.workStatus = workStatus;
		this.realName = realName;
		this.telephone = telephone;
		this.photoUrl = photoUrl;
		this.provinceName = provinceName;
		this.cityName = cityName;
		this.countyName = countyName;
	}
	
	
	

	

	public Apply(int id, int itemId, int developerId, int state, String note, Date createTime, String difftime,
			String workStatus, String realName, String telephone, String photoUrl, String provinceName, String cityName,
			String countyName, String itemName, String itemRole, int itemMoney, int period, int itemView, int itemApply,
			String stateName, String itemtype) {
		super();
		this.id = id;
		this.itemId = itemId;
		this.developerId = developerId;
		this.state = state;
		this.note = note;
		this.createTime = createTime;
		this.difftime = difftime;
		this.workStatus = workStatus;
		this.realName = realName;
		this.telephone = telephone;
		this.photoUrl = photoUrl;
		this.provinceName = provinceName;
		this.cityName = cityName;
		this.countyName = countyName;
		this.itemName = itemName;
		this.itemRole = itemRole;
		this.itemMoney = itemMoney;
		this.period = period;
		this.itemView = itemView;
		this.itemApply = itemApply;
		this.stateName = stateName;
		this.itemtype = itemtype;
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

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
	public String getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}
	
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemRole() {
		return itemRole;
	}

	public void setItemRole(String itemRole) {
		this.itemRole = itemRole;
	}

	public int getItemMoney() {
		return itemMoney;
	}

	public void setItemMoney(int itemMoney) {
		this.itemMoney = itemMoney;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public int getItemView() {
		return itemView;
	}

	public void setItemView(int itemView) {
		this.itemView = itemView;
	}

	public int getItemApply() {
		return itemApply;
	}

	public void setItemApply(int itemApply) {
		this.itemApply = itemApply;
	}

	
	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	
	public String getItemtype() {
		return itemtype;
	}

	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}

	@Override
	public String toString() {
		return "Apply [id=" + id + ", itemId=" + itemId + ", developerId=" + developerId + ", state=" + state
				+ ", note=" + note + ", createTime=" + createTime + ", difftime=" + difftime + ", workStatus="
				+ workStatus + ", realName=" + realName + ", telephone=" + telephone + ", photoUrl=" + photoUrl
				+ ", provinceName=" + provinceName + ", cityName=" + cityName + ", countyName=" + countyName
				+ ", itemName=" + itemName + ", itemRole=" + itemRole + ", itemMoney=" + itemMoney + ", period="
				+ period + ", itemView=" + itemView + ", itemApply=" + itemApply + ", stateName=" + stateName
				+ ", itemtype=" + itemtype + "]";
	}

	

	

	

	

}
